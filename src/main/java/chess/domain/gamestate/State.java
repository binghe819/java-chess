package chess.domain.gamestate;

import chess.domain.dto.ResponseDto;
import chess.domain.team.Team;

public interface State {

    boolean isFinished();

    boolean isKingDead();

    boolean isMove();

    State changeCommand(CommandType command);

    void processMove(String input, Team currentTeam);

    ResponseDto getProcessResult();
}