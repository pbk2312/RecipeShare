package CafeFinder.cafe.util;

import lombok.Getter;

@Getter
public enum ErrorMessage {

    MEMBER_NOT_FOUND("회원이 존재하지 않습니다."),
    PASSWORDS_DO_NOT_MATCH("두 비밀번호가 일치하지 않습니다."),
    PASSWORD_INCORRECT("비밀번호가 일치하지 않습니다."),
    SERVER_ERROR("서버 내부오류"),
    VALIDATION_FAILED("유효성 검증 실패"),
    LOGIN_ERROR_MESSAGE("로그인이 필요한 서비스입니다."),
    LEVEL_MESSAGE("고객님의 등급은 접근할수없습니다."),
    Member_AlreadyExists("해당 이메일은 이미 존재합니다."),
    VERIFY_CODE_MIS_MATCH("인증번호가 일치하지 않습니다."),
    NOT_VERIFY_CODE("이메일 인증이 완료 되지 않았습니다."),
    UNSUPPORTEDPROVIDER("소셜로그인 오류(제공자 오류) : "),
    PROFILESAVEEXCEPTION("프로필 이미지 저장 중 오류 발생");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

}
