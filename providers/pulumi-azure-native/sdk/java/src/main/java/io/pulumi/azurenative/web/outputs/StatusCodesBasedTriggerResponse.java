// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StatusCodesBasedTriggerResponse {
    /**
     * Request Count.
     * 
     */
    private final @Nullable Integer count;
    /**
     * Request Path
     * 
     */
    private final @Nullable String path;
    /**
     * HTTP status code.
     * 
     */
    private final @Nullable Integer status;
    /**
     * Request Sub Status.
     * 
     */
    private final @Nullable Integer subStatus;
    /**
     * Time interval.
     * 
     */
    private final @Nullable String timeInterval;
    /**
     * Win32 error code.
     * 
     */
    private final @Nullable Integer win32Status;

    @OutputCustomType.Constructor({"count","path","status","subStatus","timeInterval","win32Status"})
    private StatusCodesBasedTriggerResponse(
        @Nullable Integer count,
        @Nullable String path,
        @Nullable Integer status,
        @Nullable Integer subStatus,
        @Nullable String timeInterval,
        @Nullable Integer win32Status) {
        this.count = count;
        this.path = path;
        this.status = status;
        this.subStatus = subStatus;
        this.timeInterval = timeInterval;
        this.win32Status = win32Status;
    }

    /**
     * Request Count.
     * 
    */
    public Optional<Integer> getCount() {
        return Optional.ofNullable(this.count);
    }
    /**
     * Request Path
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * HTTP status code.
     * 
    */
    public Optional<Integer> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * Request Sub Status.
     * 
    */
    public Optional<Integer> getSubStatus() {
        return Optional.ofNullable(this.subStatus);
    }
    /**
     * Time interval.
     * 
    */
    public Optional<String> getTimeInterval() {
        return Optional.ofNullable(this.timeInterval);
    }
    /**
     * Win32 error code.
     * 
    */
    public Optional<Integer> getWin32Status() {
        return Optional.ofNullable(this.win32Status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusCodesBasedTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String path;
        private @Nullable Integer status;
        private @Nullable Integer subStatus;
        private @Nullable String timeInterval;
        private @Nullable Integer win32Status;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusCodesBasedTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.path = defaults.path;
    	      this.status = defaults.status;
    	      this.subStatus = defaults.subStatus;
    	      this.timeInterval = defaults.timeInterval;
    	      this.win32Status = defaults.win32Status;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = count;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setStatus(@Nullable Integer status) {
            this.status = status;
            return this;
        }

        public Builder setSubStatus(@Nullable Integer subStatus) {
            this.subStatus = subStatus;
            return this;
        }

        public Builder setTimeInterval(@Nullable String timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }

        public Builder setWin32Status(@Nullable Integer win32Status) {
            this.win32Status = win32Status;
            return this;
        }
        public StatusCodesBasedTriggerResponse build() {
            return new StatusCodesBasedTriggerResponse(count, path, status, subStatus, timeInterval, win32Status);
        }
    }
}