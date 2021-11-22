package utils;
public enum FilesEnum {

    DOC(0, ".doc"),
    PDF(1, ".pdf"),
    JPEG(2, ".jpeg"),
    GIF(3, ".gif"),
    BMP(4, ".bmp");

    private Integer code;
    private String  desc;

    FilesEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
