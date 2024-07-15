package com.github.tu72.pdfviewer.exception;

public class PageRenderingException extends Exception {
    private final int page;

    public PageRenderingException(int page, Throwable cause) {
        super(cause);
        this.page = page;
    }

    public int getPage() {
        return page;
    }
}
