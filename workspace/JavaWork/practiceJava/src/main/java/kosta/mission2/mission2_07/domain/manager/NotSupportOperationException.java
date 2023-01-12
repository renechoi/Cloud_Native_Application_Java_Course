package kosta.mission2.mission2_07.domain.manager;

public class NotSupportOperationException extends RuntimeException {
    public static final String CRUD_NOT_SUPPORT_OPERATION_EXCEPTION = "작업 수행 오류가 발생했습니다!";
    public static final String FILE_SAVING_IO_EXCEPTION= "파일을 저장하는 중 오류가 발생했습니다!";
    public static final String FILE_LOADING_IO_EXCEPTION= "파일을 불러오는 중 오류가 발생했습니다!";
    public static final String SORT_NOT_SUPPORT_OPERATION_EXCEPTION = "정렬 작업 수행 오류가 발생했습니다!";

    public NotSupportOperationException(String message){
        super(message);
    }
}
