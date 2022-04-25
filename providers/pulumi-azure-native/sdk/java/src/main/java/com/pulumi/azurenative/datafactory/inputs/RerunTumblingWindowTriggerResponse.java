// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Trigger that schedules pipeline reruns for all fixed time interval windows from a requested start time to requested end time.
 * 
 */
public final class RerunTumblingWindowTriggerResponse extends com.pulumi.resources.InvokeArgs {

    public static final RerunTumblingWindowTriggerResponse Empty = new RerunTumblingWindowTriggerResponse();

    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    @Import(name="annotations")
    private @Nullable List<Object> annotations;

    /**
     * @return List of tags that can be used for describing the trigger.
     * 
     */
    public Optional<List<Object>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Trigger description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Trigger description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The parent trigger reference.
     * 
     */
    @Import(name="parentTrigger", required=true)
    private Object parentTrigger;

    /**
     * @return The parent trigger reference.
     * 
     */
    public Object parentTrigger() {
        return this.parentTrigger;
    }

    /**
     * The end time for the time period for which restatement is initiated. Only UTC time is currently supported.
     * 
     */
    @Import(name="requestedEndTime", required=true)
    private String requestedEndTime;

    /**
     * @return The end time for the time period for which restatement is initiated. Only UTC time is currently supported.
     * 
     */
    public String requestedEndTime() {
        return this.requestedEndTime;
    }

    /**
     * The start time for the time period for which restatement is initiated. Only UTC time is currently supported.
     * 
     */
    @Import(name="requestedStartTime", required=true)
    private String requestedStartTime;

    /**
     * @return The start time for the time period for which restatement is initiated. Only UTC time is currently supported.
     * 
     */
    public String requestedStartTime() {
        return this.requestedStartTime;
    }

    /**
     * The max number of parallel time windows (ready for execution) for which a rerun is triggered.
     * 
     */
    @Import(name="rerunConcurrency", required=true)
    private Integer rerunConcurrency;

    /**
     * @return The max number of parallel time windows (ready for execution) for which a rerun is triggered.
     * 
     */
    public Integer rerunConcurrency() {
        return this.rerunConcurrency;
    }

    /**
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     * 
     */
    @Import(name="runtimeState", required=true)
    private String runtimeState;

    /**
     * @return Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     * 
     */
    public String runtimeState() {
        return this.runtimeState;
    }

    /**
     * Trigger type.
     * Expected value is &#39;RerunTumblingWindowTrigger&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Trigger type.
     * Expected value is &#39;RerunTumblingWindowTrigger&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private RerunTumblingWindowTriggerResponse() {}

    private RerunTumblingWindowTriggerResponse(RerunTumblingWindowTriggerResponse $) {
        this.annotations = $.annotations;
        this.description = $.description;
        this.parentTrigger = $.parentTrigger;
        this.requestedEndTime = $.requestedEndTime;
        this.requestedStartTime = $.requestedStartTime;
        this.rerunConcurrency = $.rerunConcurrency;
        this.runtimeState = $.runtimeState;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RerunTumblingWindowTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RerunTumblingWindowTriggerResponse $;

        public Builder() {
            $ = new RerunTumblingWindowTriggerResponse();
        }

        public Builder(RerunTumblingWindowTriggerResponse defaults) {
            $ = new RerunTumblingWindowTriggerResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations List of tags that can be used for describing the trigger.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the trigger.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param description Trigger description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param parentTrigger The parent trigger reference.
         * 
         * @return builder
         * 
         */
        public Builder parentTrigger(Object parentTrigger) {
            $.parentTrigger = parentTrigger;
            return this;
        }

        /**
         * @param requestedEndTime The end time for the time period for which restatement is initiated. Only UTC time is currently supported.
         * 
         * @return builder
         * 
         */
        public Builder requestedEndTime(String requestedEndTime) {
            $.requestedEndTime = requestedEndTime;
            return this;
        }

        /**
         * @param requestedStartTime The start time for the time period for which restatement is initiated. Only UTC time is currently supported.
         * 
         * @return builder
         * 
         */
        public Builder requestedStartTime(String requestedStartTime) {
            $.requestedStartTime = requestedStartTime;
            return this;
        }

        /**
         * @param rerunConcurrency The max number of parallel time windows (ready for execution) for which a rerun is triggered.
         * 
         * @return builder
         * 
         */
        public Builder rerunConcurrency(Integer rerunConcurrency) {
            $.rerunConcurrency = rerunConcurrency;
            return this;
        }

        /**
         * @param runtimeState Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
         * 
         * @return builder
         * 
         */
        public Builder runtimeState(String runtimeState) {
            $.runtimeState = runtimeState;
            return this;
        }

        /**
         * @param type Trigger type.
         * Expected value is &#39;RerunTumblingWindowTrigger&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public RerunTumblingWindowTriggerResponse build() {
            $.parentTrigger = Objects.requireNonNull($.parentTrigger, "expected parameter 'parentTrigger' to be non-null");
            $.requestedEndTime = Objects.requireNonNull($.requestedEndTime, "expected parameter 'requestedEndTime' to be non-null");
            $.requestedStartTime = Objects.requireNonNull($.requestedStartTime, "expected parameter 'requestedStartTime' to be non-null");
            $.rerunConcurrency = Objects.requireNonNull($.rerunConcurrency, "expected parameter 'rerunConcurrency' to be non-null");
            $.runtimeState = Objects.requireNonNull($.runtimeState, "expected parameter 'runtimeState' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
