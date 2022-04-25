// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudtasks_v2.inputs.StatusResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The status of a task attempt.
 * 
 */
public final class AttemptResponse extends com.pulumi.resources.InvokeArgs {

    public static final AttemptResponse Empty = new AttemptResponse();

    /**
     * The time that this attempt was dispatched. `dispatch_time` will be truncated to the nearest microsecond.
     * 
     */
    @Import(name="dispatchTime", required=true)
    private String dispatchTime;

    /**
     * @return The time that this attempt was dispatched. `dispatch_time` will be truncated to the nearest microsecond.
     * 
     */
    public String dispatchTime() {
        return this.dispatchTime;
    }

    /**
     * The response from the worker for this attempt. If `response_time` is unset, then the task has not been attempted or is currently running and the `response_status` field is meaningless.
     * 
     */
    @Import(name="responseStatus", required=true)
    private StatusResponse responseStatus;

    /**
     * @return The response from the worker for this attempt. If `response_time` is unset, then the task has not been attempted or is currently running and the `response_status` field is meaningless.
     * 
     */
    public StatusResponse responseStatus() {
        return this.responseStatus;
    }

    /**
     * The time that this attempt response was received. `response_time` will be truncated to the nearest microsecond.
     * 
     */
    @Import(name="responseTime", required=true)
    private String responseTime;

    /**
     * @return The time that this attempt response was received. `response_time` will be truncated to the nearest microsecond.
     * 
     */
    public String responseTime() {
        return this.responseTime;
    }

    /**
     * The time that this attempt was scheduled. `schedule_time` will be truncated to the nearest microsecond.
     * 
     */
    @Import(name="scheduleTime", required=true)
    private String scheduleTime;

    /**
     * @return The time that this attempt was scheduled. `schedule_time` will be truncated to the nearest microsecond.
     * 
     */
    public String scheduleTime() {
        return this.scheduleTime;
    }

    private AttemptResponse() {}

    private AttemptResponse(AttemptResponse $) {
        this.dispatchTime = $.dispatchTime;
        this.responseStatus = $.responseStatus;
        this.responseTime = $.responseTime;
        this.scheduleTime = $.scheduleTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttemptResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttemptResponse $;

        public Builder() {
            $ = new AttemptResponse();
        }

        public Builder(AttemptResponse defaults) {
            $ = new AttemptResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param dispatchTime The time that this attempt was dispatched. `dispatch_time` will be truncated to the nearest microsecond.
         * 
         * @return builder
         * 
         */
        public Builder dispatchTime(String dispatchTime) {
            $.dispatchTime = dispatchTime;
            return this;
        }

        /**
         * @param responseStatus The response from the worker for this attempt. If `response_time` is unset, then the task has not been attempted or is currently running and the `response_status` field is meaningless.
         * 
         * @return builder
         * 
         */
        public Builder responseStatus(StatusResponse responseStatus) {
            $.responseStatus = responseStatus;
            return this;
        }

        /**
         * @param responseTime The time that this attempt response was received. `response_time` will be truncated to the nearest microsecond.
         * 
         * @return builder
         * 
         */
        public Builder responseTime(String responseTime) {
            $.responseTime = responseTime;
            return this;
        }

        /**
         * @param scheduleTime The time that this attempt was scheduled. `schedule_time` will be truncated to the nearest microsecond.
         * 
         * @return builder
         * 
         */
        public Builder scheduleTime(String scheduleTime) {
            $.scheduleTime = scheduleTime;
            return this;
        }

        public AttemptResponse build() {
            $.dispatchTime = Objects.requireNonNull($.dispatchTime, "expected parameter 'dispatchTime' to be non-null");
            $.responseStatus = Objects.requireNonNull($.responseStatus, "expected parameter 'responseStatus' to be non-null");
            $.responseTime = Objects.requireNonNull($.responseTime, "expected parameter 'responseTime' to be non-null");
            $.scheduleTime = Objects.requireNonNull($.scheduleTime, "expected parameter 'scheduleTime' to be non-null");
            return $;
        }
    }

}
