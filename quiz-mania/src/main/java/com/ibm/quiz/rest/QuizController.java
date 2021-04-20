package com.ibm.quiz.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.quiz.entity.Option;
import com.ibm.quiz.entity.Question;
import com.ibm.quiz.entity.Quiz;
import com.ibm.quiz.entity.User;
import com.ibm.quiz.exception.InvalidRequestException;
import com.ibm.quiz.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {

	
	@Autowired 
	private QuizService service;
	
	@PostMapping(value = "/create/{topic}")
	public String createQuiz(@PathVariable("topic") String topic) {
		Quiz q = new Quiz();
		q.setTopic(topic);
		int qcode = service.addQuiz(q);
		return "Quiz added with ID: " + qcode;
	}
	
	@PostMapping(value = "/addQue/{code}", consumes = "application/json")
	public String addQuestion(@RequestBody Question que,  @PathVariable int code) {
		int qid = service.addQuestion(que, code);
		return "Question added with id : " + qid;
	}
	
	@PostMapping(value = "/addOpt/{qid}", consumes = "application/json")
	public String addQuestion(@RequestBody Option op, @PathVariable int qid) {
		int opid = service.addOption(op, qid);
		return "Option added with id : " + opid;
	}
	
	@GetMapping(value = "/getQ/{qid}", produces = "application/json")
	public Question getQuestion(@PathVariable int qid) {
		return service.fetchhQuestion(qid);
	}
	
	@GetMapping(value = "/get/{code}", produces = "application/json")
	public Quiz getQuiz(@PathVariable int code) throws InvalidRequestException {
		return service.fetchQuiz(code);
	}
	
	@PostMapping(value = "/submit", consumes = "application/json")
	public String submitQuiz(@RequestBody Quiz q) {
		return service.submitQuiz(q);
	}
}
