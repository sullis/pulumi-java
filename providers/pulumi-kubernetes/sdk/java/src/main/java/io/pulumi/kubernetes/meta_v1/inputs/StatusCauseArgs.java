// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.meta_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.
 * 
 */
public final class StatusCauseArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatusCauseArgs Empty = new StatusCauseArgs();

    /**
     * The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.
     * 
     * Examples:
     *   "name" - the field "name" on the current resource
     *   "items[0].name" - the field "name" on the first array entry in "items"
     * 
     */
    @InputImport(name="field")
    private final @Nullable Input<String> field;

    public Input<String> getField() {
        return this.field == null ? Input.empty() : this.field;
    }

    /**
     * A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
     * 
     */
    @InputImport(name="message")
    private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    /**
     * A machine-readable description of the cause of the error. If this value is empty there is no information available.
     * 
     */
    @InputImport(name="reason")
    private final @Nullable Input<String> reason;

    public Input<String> getReason() {
        return this.reason == null ? Input.empty() : this.reason;
    }

    public StatusCauseArgs(
        @Nullable Input<String> field,
        @Nullable Input<String> message,
        @Nullable Input<String> reason) {
        this.field = field;
        this.message = message;
        this.reason = reason;
    }

    private StatusCauseArgs() {
        this.field = Input.empty();
        this.message = Input.empty();
        this.reason = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusCauseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> field;
        private @Nullable Input<String> message;
        private @Nullable Input<String> reason;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusCauseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
        }

        public Builder setField(@Nullable Input<String> field) {
            this.field = field;
            return this;
        }

        public Builder setField(@Nullable String field) {
            this.field = Input.ofNullable(field);
            return this;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder setReason(@Nullable Input<String> reason) {
            this.reason = reason;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = Input.ofNullable(reason);
            return this;
        }

        public StatusCauseArgs build() {
            return new StatusCauseArgs(field, message, reason);
        }
    }
}
