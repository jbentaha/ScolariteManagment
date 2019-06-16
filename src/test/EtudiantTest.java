package test;

import org.junit.jupiter.api.Test;

import pack1.Etudiant;
import pack2.Mention;

public class EtudiantTest {

	@Test
	void test() {
		Etudiant etud = new Etudiant("bentahar", "jaouad", 24,"bj24");
		assert(etud.getMention(9.5).equals(Mention.AJOURNEE));
		assert(etud.getAge() == 24);
		System.out.println(etud.getMoyenne());
	}

}
