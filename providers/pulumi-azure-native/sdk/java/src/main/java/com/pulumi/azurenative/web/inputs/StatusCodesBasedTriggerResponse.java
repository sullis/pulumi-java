// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Trigger based on status code.
 * 
 */
public final class StatusCodesBasedTriggerResponse extends com.pulumi.resources.InvokeArgs {

    public static final StatusCodesBasedTriggerResponse Empty = new StatusCodesBasedTriggerResponse();

    /**
     * Request Count.
     * 
     */
    @Import(name="count")
    private @Nullable Integer count;

    /**
     * @return Request Count.
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * Request Path
     * 
     */
    @Import(name="path")
    private @Nullable String path;

    /**
     * @return Request Path
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * HTTP status code.
     * 
     */
    @Import(name="status")
    private @Nullable Integer status;

    /**
     * @return HTTP status code.
     * 
     */
    public Optional<Integer> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Request Sub Status.
     * 
     */
    @Import(name="subStatus")
    private @Nullable Integer subStatus;

    /**
     * @return Request Sub Status.
     * 
     */
    public Optional<Integer> subStatus() {
        return Optional.ofNullable(this.subStatus);
    }

    /**
     * Time interval.
     * 
     */
    @Import(name="timeInterval")
    private @Nullable String timeInterval;

    /**
     * @return Time interval.
     * 
     */
    public Optional<String> timeInterval() {
        return Optional.ofNullable(this.timeInterval);
    }

    /**
     * Win32 error code.
     * 
     */
    @Import(name="win32Status")
    private @Nullable Integer win32Status;

    /**
     * @return Win32 error code.
     * 
     */
    public Optional<Integer> win32Status() {
        return Optional.ofNullable(this.win32Status);
    }

    private StatusCodesBasedTriggerResponse() {}

    private StatusCodesBasedTriggerResponse(StatusCodesBasedTriggerResponse $) {
        this.count = $.count;
        this.path = $.path;
        this.status = $.status;
        this.subStatus = $.subStatus;
        this.timeInterval = $.timeInterval;
        this.win32Status = $.win32Status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatusCodesBasedTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatusCodesBasedTriggerResponse $;

        public Builder() {
            $ = new StatusCodesBasedTriggerResponse();
        }

        public Builder(StatusCodesBasedTriggerResponse defaults) {
            $ = new StatusCodesBasedTriggerResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param count Request Count.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Integer count) {
            $.count = count;
            return this;
        }

        /**
         * @param path Request Path
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable String path) {
            $.path = path;
            return this;
        }

        /**
         * @param status HTTP status code.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Integer status) {
            $.status = status;
            return this;
        }

        /**
         * @param subStatus Request Sub Status.
         * 
         * @return builder
         * 
         */
        public Builder subStatus(@Nullable Integer subStatus) {
            $.subStatus = subStatus;
            return this;
        }

        /**
         * @param timeInterval Time interval.
         * 
         * @return builder
         * 
         */
        public Builder timeInterval(@Nullable String timeInterval) {
            $.timeInterval = timeInterval;
            return this;
        }

        /**
         * @param win32Status Win32 error code.
         * 
         * @return builder
         * 
         */
        public Builder win32Status(@Nullable Integer win32Status) {
            $.win32Status = win32Status;
            return this;
        }

        public StatusCodesBasedTriggerResponse build() {
            return $;
        }
    }

}
