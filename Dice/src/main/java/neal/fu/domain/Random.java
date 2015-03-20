package neal.fu.domain;

/**
 * @author neal.fu
 */
public interface Random {

    Chances oneRollChances();

    Chances multipleRollChances(int maxPoints);
}
