// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Exception object for all custom exceptions
 * 
 */
public final class ReportableExceptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ReportableExceptionResponse Empty = new ReportableExceptionResponse();

    /**
     * Actionable steps for this exception
     * 
     */
    @Import(name="actionableMessage")
    private @Nullable String actionableMessage;

    /**
     * @return Actionable steps for this exception
     * 
     */
    public Optional<String> actionableMessage() {
        return Optional.ofNullable(this.actionableMessage);
    }

    /**
     * The path to the file where exception occurred
     * 
     */
    @Import(name="filePath", required=true)
    private String filePath;

    /**
     * @return The path to the file where exception occurred
     * 
     */
    public String filePath() {
        return this.filePath;
    }

    /**
     * Coded numerical value that is assigned to a specific exception
     * 
     */
    @Import(name="hResult", required=true)
    private Integer hResult;

    /**
     * @return Coded numerical value that is assigned to a specific exception
     * 
     */
    public Integer hResult() {
        return this.hResult;
    }

    /**
     * The line number where exception occurred
     * 
     */
    @Import(name="lineNumber", required=true)
    private String lineNumber;

    /**
     * @return The line number where exception occurred
     * 
     */
    public String lineNumber() {
        return this.lineNumber;
    }

    /**
     * Error message
     * 
     */
    @Import(name="message", required=true)
    private String message;

    /**
     * @return Error message
     * 
     */
    public String message() {
        return this.message;
    }

    /**
     * Stack trace
     * 
     */
    @Import(name="stackTrace", required=true)
    private String stackTrace;

    /**
     * @return Stack trace
     * 
     */
    public String stackTrace() {
        return this.stackTrace;
    }

    private ReportableExceptionResponse() {}

    private ReportableExceptionResponse(ReportableExceptionResponse $) {
        this.actionableMessage = $.actionableMessage;
        this.filePath = $.filePath;
        this.hResult = $.hResult;
        this.lineNumber = $.lineNumber;
        this.message = $.message;
        this.stackTrace = $.stackTrace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportableExceptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportableExceptionResponse $;

        public Builder() {
            $ = new ReportableExceptionResponse();
        }

        public Builder(ReportableExceptionResponse defaults) {
            $ = new ReportableExceptionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionableMessage Actionable steps for this exception
         * 
         * @return builder
         * 
         */
        public Builder actionableMessage(@Nullable String actionableMessage) {
            $.actionableMessage = actionableMessage;
            return this;
        }

        /**
         * @param filePath The path to the file where exception occurred
         * 
         * @return builder
         * 
         */
        public Builder filePath(String filePath) {
            $.filePath = filePath;
            return this;
        }

        /**
         * @param hResult Coded numerical value that is assigned to a specific exception
         * 
         * @return builder
         * 
         */
        public Builder hResult(Integer hResult) {
            $.hResult = hResult;
            return this;
        }

        /**
         * @param lineNumber The line number where exception occurred
         * 
         * @return builder
         * 
         */
        public Builder lineNumber(String lineNumber) {
            $.lineNumber = lineNumber;
            return this;
        }

        /**
         * @param message Error message
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            $.message = message;
            return this;
        }

        /**
         * @param stackTrace Stack trace
         * 
         * @return builder
         * 
         */
        public Builder stackTrace(String stackTrace) {
            $.stackTrace = stackTrace;
            return this;
        }

        public ReportableExceptionResponse build() {
            $.filePath = Objects.requireNonNull($.filePath, "expected parameter 'filePath' to be non-null");
            $.hResult = Objects.requireNonNull($.hResult, "expected parameter 'hResult' to be non-null");
            $.lineNumber = Objects.requireNonNull($.lineNumber, "expected parameter 'lineNumber' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            $.stackTrace = Objects.requireNonNull($.stackTrace, "expected parameter 'stackTrace' to be non-null");
            return $;
        }
    }

}
