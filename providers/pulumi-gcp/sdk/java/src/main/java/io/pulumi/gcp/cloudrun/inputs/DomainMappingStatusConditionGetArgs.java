// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainMappingStatusConditionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainMappingStatusConditionGetArgs Empty = new DomainMappingStatusConditionGetArgs();

    @InputImport(name="message")
      private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    @InputImport(name="reason")
      private final @Nullable Input<String> reason;

    public Input<String> getReason() {
        return this.reason == null ? Input.empty() : this.reason;
    }

    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public DomainMappingStatusConditionGetArgs(
        @Nullable Input<String> message,
        @Nullable Input<String> reason,
        @Nullable Input<String> status,
        @Nullable Input<String> type) {
        this.message = message;
        this.reason = reason;
        this.status = status;
        this.type = type;
    }

    private DomainMappingStatusConditionGetArgs() {
        this.message = Input.empty();
        this.reason = Input.empty();
        this.status = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingStatusConditionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> message;
        private @Nullable Input<String> reason;
        private @Nullable Input<String> status;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingStatusConditionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
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

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public DomainMappingStatusConditionGetArgs build() {
            return new DomainMappingStatusConditionGetArgs(message, reason, status, type);
        }
    }
}