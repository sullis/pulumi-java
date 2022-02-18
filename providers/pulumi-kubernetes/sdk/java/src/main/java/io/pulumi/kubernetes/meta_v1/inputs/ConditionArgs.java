// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.meta_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Condition contains details for one aspect of the current state of this API Resource.
 * 
 */
public final class ConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConditionArgs Empty = new ConditionArgs();

    /**
     * lastTransitionTime is the last time the condition transitioned from one status to another. This should be when the underlying condition changed.  If that is not known, then using the time when the API field changed is acceptable.
     * 
     */
    @InputImport(name="lastTransitionTime", required=true)
    private final Input<String> lastTransitionTime;

    public Input<String> getLastTransitionTime() {
        return this.lastTransitionTime;
    }

    /**
     * message is a human readable message indicating details about the transition. This may be an empty string.
     * 
     */
    @InputImport(name="message", required=true)
    private final Input<String> message;

    public Input<String> getMessage() {
        return this.message;
    }

    /**
     * observedGeneration represents the .metadata.generation that the condition was set based upon. For instance, if .metadata.generation is currently 12, but the .status.conditions[x].observedGeneration is 9, the condition is out of date with respect to the current state of the instance.
     * 
     */
    @InputImport(name="observedGeneration")
    private final @Nullable Input<Integer> observedGeneration;

    public Input<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Input.empty() : this.observedGeneration;
    }

    /**
     * reason contains a programmatic identifier indicating the reason for the condition's last transition. Producers of specific condition types may define expected values and meanings for this field, and whether the values are considered a guaranteed API. The value should be a CamelCase string. This field may not be empty.
     * 
     */
    @InputImport(name="reason", required=true)
    private final Input<String> reason;

    public Input<String> getReason() {
        return this.reason;
    }

    /**
     * status of the condition, one of True, False, Unknown.
     * 
     */
    @InputImport(name="status", required=true)
    private final Input<String> status;

    public Input<String> getStatus() {
        return this.status;
    }

    /**
     * type of condition in CamelCase or in foo.example.com/CamelCase.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ConditionArgs(
        Input<String> lastTransitionTime,
        Input<String> message,
        @Nullable Input<Integer> observedGeneration,
        Input<String> reason,
        Input<String> status,
        Input<String> type) {
        this.lastTransitionTime = Objects.requireNonNull(lastTransitionTime, "expected parameter 'lastTransitionTime' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.observedGeneration = observedGeneration;
        this.reason = Objects.requireNonNull(reason, "expected parameter 'reason' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ConditionArgs() {
        this.lastTransitionTime = Input.empty();
        this.message = Input.empty();
        this.observedGeneration = Input.empty();
        this.reason = Input.empty();
        this.status = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> lastTransitionTime;
        private Input<String> message;
        private @Nullable Input<Integer> observedGeneration;
        private Input<String> reason;
        private Input<String> status;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setLastTransitionTime(Input<String> lastTransitionTime) {
            this.lastTransitionTime = Objects.requireNonNull(lastTransitionTime);
            return this;
        }

        public Builder setLastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = Input.of(Objects.requireNonNull(lastTransitionTime));
            return this;
        }

        public Builder setMessage(Input<String> message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Input.of(Objects.requireNonNull(message));
            return this;
        }

        public Builder setObservedGeneration(@Nullable Input<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Input.ofNullable(observedGeneration);
            return this;
        }

        public Builder setReason(Input<String> reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = Input.of(Objects.requireNonNull(reason));
            return this;
        }

        public Builder setStatus(Input<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public ConditionArgs build() {
            return new ConditionArgs(lastTransitionTime, message, observedGeneration, reason, status, type);
        }
    }
}
