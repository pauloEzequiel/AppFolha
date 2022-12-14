package br.edu.infnet.appfolha.services;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfolha.entidades.Beneficio;
import br.edu.infnet.appfolha.entidades.Devolucao;
import br.edu.infnet.appfolha.entidades.Funcionario;
import br.edu.infnet.appfolha.entidades.Pagamento;
import br.edu.infnet.appfolha.entidades.Salario;
import br.edu.infnet.appfolha.repositories.BeneficioRepository;
import br.edu.infnet.appfolha.repositories.DevolucaoRepository;
import br.edu.infnet.appfolha.repositories.FuncionarioRepository;
import br.edu.infnet.appfolha.repositories.PagamentoRepository;
import br.edu.infnet.appfolha.repositories.SalarioRepository;

@Service
public class DBService {

	@Autowired
	private FuncionarioRepository funcRep;
	
	@Autowired
	private SalarioRepository salRep;
	
	@Autowired
	private BeneficioRepository beneficioRep;
	
	@Autowired
	private DevolucaoRepository devRep;
	
	@Autowired
	private PagamentoRepository pagRep;
	
	@Autowired
	private UsuarioService userServ;
	public void instantiateTestDatabase() throws ParseException {
		
		//Usuario user = new Usuario();
		//user.setEmail("admin@admin.com");
		//user.setNome("Administrador");
		//user.setSenha("123");
		
		//userServ.incluir(user);
		
		Funcionario  func1 = new Funcionario(null,"Paulo Ezequiel","999.999.999-99","Analista","ARACAJU-SE",new ArrayList<Pagamento>());
		Funcionario  func2 = new Funcionario(null,"José Tavares","999.999.999-99","Analista","ARACAJU-SE",new ArrayList<Pagamento>());
		Funcionario  func3 = new Funcionario(null,"Maria Lopes","999.999.999-99","Gerente","ARACAJU-SE",new ArrayList<Pagamento>());
		Funcionario  func4 = new Funcionario(null,"Sandy Duarte","999.999.999-99","Superintendente","ARACAJU-SE",new ArrayList<Pagamento>());
		funcRep.saveAll((Arrays.asList(func1,func2,func3,func4)));
		
		
		Salario folhaSalario = new Salario(null, 10, 2022, "SALARIO REFERENTE A COMPETENCIA OUTUBRO DE 2022", 35000.0, new ArrayList<Pagamento>());
		Beneficio folhaBeneficio = new Beneficio(null, 10, 2022, "BENEFICIO REFERENTE A COMPETENCIA OUTUBRO DE 2022", 6000.0, new ArrayList<Pagamento>());
		Devolucao folhaDevolucao = new Devolucao(null, 10, 2022, "DEVOLUÇÕES REFERENTE A COMPETENCIA OUTUBRO DE 2022", 7000.0, new ArrayList<Pagamento>());
		
		salRep.save(folhaSalario);
		beneficioRep.save(folhaBeneficio);
		devRep.save(folhaDevolucao);
		
		Pagamento pag1= new Pagamento(null, 10, 2022,1500.0,func1,folhaSalario );
		Pagamento pag2= new Pagamento(null, 10, 2022, 1500.0,func2,folhaSalario );
		Pagamento pag3= new Pagamento(null, 10, 2022, 7000.0,func3,folhaSalario );
		Pagamento pag4= new Pagamento(null, 10, 2022, 9000.0,func4,folhaSalario );
		
		Pagamento pag5= new Pagamento(null, 10, 2022, 500.0,func1,folhaBeneficio );
		Pagamento pag6= new Pagamento(null, 10, 2022, 500.0,func2,folhaBeneficio );
		Pagamento pag7= new Pagamento(null, 10, 2022, 500.0,func3,folhaBeneficio );
		Pagamento pag8= new Pagamento(null, 10, 2022, 500.0,func4,folhaBeneficio );
		
		Pagamento pag9= new Pagamento(null, 10, 2022, 250.0,func1,folhaDevolucao );
		Pagamento pag10= new Pagamento(null, 10, 2022, 250.0,func4,folhaDevolucao );
		
		
		pagRep.saveAll((Arrays.asList(pag1,pag2,pag3,pag4,pag5,pag6,pag7,pag8,pag9,pag10)));
	}
}
