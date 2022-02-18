// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelActionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the `actions` to be performed when the `condition` evaluates to `TRUE`.
 * 
 */
public final class DetectorModelEventArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelEventArgs Empty = new DetectorModelEventArgs();

    /**
     * The actions to be performed.
     * 
     */
    @InputImport(name="actions")
    private final @Nullable Input<List<DetectorModelActionArgs>> actions;

    public Input<List<DetectorModelActionArgs>> getActions() {
        return this.actions == null ? Input.empty() : this.actions;
    }

    /**
     * The Boolean expression that, when `TRUE`, causes the `actions` to be performed. If not present, the `actions` are performed (=`TRUE`). If the expression result is not a `Boolean` value, the `actions` are not performed (=`FALSE`).
     * 
     */
    @InputImport(name="condition")
    private final @Nullable Input<String> condition;

    public Input<String> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * The name of the event.
     * 
     */
    @InputImport(name="eventName", required=true)
    private final Input<String> eventName;

    public Input<String> getEventName() {
        return this.eventName;
    }

    public DetectorModelEventArgs(
        @Nullable Input<List<DetectorModelActionArgs>> actions,
        @Nullable Input<String> condition,
        Input<String> eventName) {
        this.actions = actions;
        this.condition = condition;
        this.eventName = Objects.requireNonNull(eventName, "expected parameter 'eventName' to be non-null");
    }

    private DetectorModelEventArgs() {
        this.actions = Input.empty();
        this.condition = Input.empty();
        this.eventName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelEventArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DetectorModelActionArgs>> actions;
        private @Nullable Input<String> condition;
        private Input<String> eventName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelEventArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.condition = defaults.condition;
    	      this.eventName = defaults.eventName;
        }

        public Builder setActions(@Nullable Input<List<DetectorModelActionArgs>> actions) {
            this.actions = actions;
            return this;
        }

        public Builder setActions(@Nullable List<DetectorModelActionArgs> actions) {
            this.actions = Input.ofNullable(actions);
            return this;
        }

        public Builder setCondition(@Nullable Input<String> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable String condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setEventName(Input<String> eventName) {
            this.eventName = Objects.requireNonNull(eventName);
            return this;
        }

        public Builder setEventName(String eventName) {
            this.eventName = Input.of(Objects.requireNonNull(eventName));
            return this;
        }

        public DetectorModelEventArgs build() {
            return new DetectorModelEventArgs(actions, condition, eventName);
        }
    }
}
