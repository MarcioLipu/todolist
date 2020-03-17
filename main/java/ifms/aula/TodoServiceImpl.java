package ifms.aula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService{
	@Autowired
	private TodoRepository todoRepository;
	@Autowired
	
	public List<Todo>findAll(){
		return todoRepository.findAll();
	}
	
	public void saveOrUpdate(Todo todo){
	todoRepository.save(todo);
	}
	

}
