package br.com.meumenu.service;

import javax.ejb.Stateless;

import br.com.meumenu.model.cadastro.Fornecedor;
import br.com.meumenu.model.cardapio.Refeicao;
import br.com.meumenu.model.cardapio.Variacao;

@Stateless
public class CarpadioService extends BaseService<Refeicao> {

	public void register(Refeicao entity, int idFornecedor) throws Exception {
		log.info("Registering: " + entity);
		entity.setFornecedor(new Fornecedor(idFornecedor));
		validate(entity);
		for (Variacao variacao : entity.getVariacoes()) {
			variacao.setRefeicao(entity);
		}
		em.persist(entity);
		eventSrc.fire(entity);
	}

	@Override
	public void update(Refeicao entity) {
		for (Variacao variacao : entity.getVariacoes()) {
			variacao.setRefeicao(entity);
		}
		super.update(entity);
	}

}
