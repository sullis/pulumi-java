// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Retry config. These settings determine when a failed task attempt is retried.
 * 
 */
public final class RetryConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final RetryConfigResponse Empty = new RetryConfigResponse();

    /**
     * Number of attempts per task. Cloud Tasks will attempt the task `max_attempts` times (that is, if the first attempt fails, then there will be `max_attempts - 1` retries). Must be &gt;= -1. If unspecified when the queue is created, Cloud Tasks will pick the default. -1 indicates unlimited attempts. This field has the same meaning as [task_retry_limit in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    @Import(name="maxAttempts", required=true)
    private Integer maxAttempts;

    /**
     * @return Number of attempts per task. Cloud Tasks will attempt the task `max_attempts` times (that is, if the first attempt fails, then there will be `max_attempts - 1` retries). Must be &gt;= -1. If unspecified when the queue is created, Cloud Tasks will pick the default. -1 indicates unlimited attempts. This field has the same meaning as [task_retry_limit in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    public Integer maxAttempts() {
        return this.maxAttempts;
    }

    /**
     * A task will be scheduled for retry between min_backoff and max_backoff duration after it fails, if the queue&#39;s RetryConfig specifies that the task should be retried. If unspecified when the queue is created, Cloud Tasks will pick the default. `max_backoff` will be truncated to the nearest second. This field has the same meaning as [max_backoff_seconds in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    @Import(name="maxBackoff", required=true)
    private String maxBackoff;

    /**
     * @return A task will be scheduled for retry between min_backoff and max_backoff duration after it fails, if the queue&#39;s RetryConfig specifies that the task should be retried. If unspecified when the queue is created, Cloud Tasks will pick the default. `max_backoff` will be truncated to the nearest second. This field has the same meaning as [max_backoff_seconds in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    public String maxBackoff() {
        return this.maxBackoff;
    }

    /**
     * The time between retries will double `max_doublings` times. A task&#39;s retry interval starts at min_backoff, then doubles `max_doublings` times, then increases linearly, and finally retries at intervals of max_backoff up to max_attempts times. For example, if min_backoff is 10s, max_backoff is 300s, and `max_doublings` is 3, then the a task will first be retried in 10s. The retry interval will double three times, and then increase linearly by 2^3 * 10s. Finally, the task will retry at intervals of max_backoff until the task has been attempted max_attempts times. Thus, the requests will retry at 10s, 20s, 40s, 80s, 160s, 240s, 300s, 300s, .... If unspecified when the queue is created, Cloud Tasks will pick the default. This field has the same meaning as [max_doublings in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    @Import(name="maxDoublings", required=true)
    private Integer maxDoublings;

    /**
     * @return The time between retries will double `max_doublings` times. A task&#39;s retry interval starts at min_backoff, then doubles `max_doublings` times, then increases linearly, and finally retries at intervals of max_backoff up to max_attempts times. For example, if min_backoff is 10s, max_backoff is 300s, and `max_doublings` is 3, then the a task will first be retried in 10s. The retry interval will double three times, and then increase linearly by 2^3 * 10s. Finally, the task will retry at intervals of max_backoff until the task has been attempted max_attempts times. Thus, the requests will retry at 10s, 20s, 40s, 80s, 160s, 240s, 300s, 300s, .... If unspecified when the queue is created, Cloud Tasks will pick the default. This field has the same meaning as [max_doublings in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    public Integer maxDoublings() {
        return this.maxDoublings;
    }

    /**
     * If positive, `max_retry_duration` specifies the time limit for retrying a failed task, measured from when the task was first attempted. Once `max_retry_duration` time has passed *and* the task has been attempted max_attempts times, no further attempts will be made and the task will be deleted. If zero, then the task age is unlimited. If unspecified when the queue is created, Cloud Tasks will pick the default. `max_retry_duration` will be truncated to the nearest second. This field has the same meaning as [task_age_limit in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    @Import(name="maxRetryDuration", required=true)
    private String maxRetryDuration;

    /**
     * @return If positive, `max_retry_duration` specifies the time limit for retrying a failed task, measured from when the task was first attempted. Once `max_retry_duration` time has passed *and* the task has been attempted max_attempts times, no further attempts will be made and the task will be deleted. If zero, then the task age is unlimited. If unspecified when the queue is created, Cloud Tasks will pick the default. `max_retry_duration` will be truncated to the nearest second. This field has the same meaning as [task_age_limit in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    public String maxRetryDuration() {
        return this.maxRetryDuration;
    }

    /**
     * A task will be scheduled for retry between min_backoff and max_backoff duration after it fails, if the queue&#39;s RetryConfig specifies that the task should be retried. If unspecified when the queue is created, Cloud Tasks will pick the default. `min_backoff` will be truncated to the nearest second. This field has the same meaning as [min_backoff_seconds in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    @Import(name="minBackoff", required=true)
    private String minBackoff;

    /**
     * @return A task will be scheduled for retry between min_backoff and max_backoff duration after it fails, if the queue&#39;s RetryConfig specifies that the task should be retried. If unspecified when the queue is created, Cloud Tasks will pick the default. `min_backoff` will be truncated to the nearest second. This field has the same meaning as [min_backoff_seconds in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    public String minBackoff() {
        return this.minBackoff;
    }

    private RetryConfigResponse() {}

    private RetryConfigResponse(RetryConfigResponse $) {
        this.maxAttempts = $.maxAttempts;
        this.maxBackoff = $.maxBackoff;
        this.maxDoublings = $.maxDoublings;
        this.maxRetryDuration = $.maxRetryDuration;
        this.minBackoff = $.minBackoff;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RetryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RetryConfigResponse $;

        public Builder() {
            $ = new RetryConfigResponse();
        }

        public Builder(RetryConfigResponse defaults) {
            $ = new RetryConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxAttempts Number of attempts per task. Cloud Tasks will attempt the task `max_attempts` times (that is, if the first attempt fails, then there will be `max_attempts - 1` retries). Must be &gt;= -1. If unspecified when the queue is created, Cloud Tasks will pick the default. -1 indicates unlimited attempts. This field has the same meaning as [task_retry_limit in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
         * 
         * @return builder
         * 
         */
        public Builder maxAttempts(Integer maxAttempts) {
            $.maxAttempts = maxAttempts;
            return this;
        }

        /**
         * @param maxBackoff A task will be scheduled for retry between min_backoff and max_backoff duration after it fails, if the queue&#39;s RetryConfig specifies that the task should be retried. If unspecified when the queue is created, Cloud Tasks will pick the default. `max_backoff` will be truncated to the nearest second. This field has the same meaning as [max_backoff_seconds in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
         * 
         * @return builder
         * 
         */
        public Builder maxBackoff(String maxBackoff) {
            $.maxBackoff = maxBackoff;
            return this;
        }

        /**
         * @param maxDoublings The time between retries will double `max_doublings` times. A task&#39;s retry interval starts at min_backoff, then doubles `max_doublings` times, then increases linearly, and finally retries at intervals of max_backoff up to max_attempts times. For example, if min_backoff is 10s, max_backoff is 300s, and `max_doublings` is 3, then the a task will first be retried in 10s. The retry interval will double three times, and then increase linearly by 2^3 * 10s. Finally, the task will retry at intervals of max_backoff until the task has been attempted max_attempts times. Thus, the requests will retry at 10s, 20s, 40s, 80s, 160s, 240s, 300s, 300s, .... If unspecified when the queue is created, Cloud Tasks will pick the default. This field has the same meaning as [max_doublings in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
         * 
         * @return builder
         * 
         */
        public Builder maxDoublings(Integer maxDoublings) {
            $.maxDoublings = maxDoublings;
            return this;
        }

        /**
         * @param maxRetryDuration If positive, `max_retry_duration` specifies the time limit for retrying a failed task, measured from when the task was first attempted. Once `max_retry_duration` time has passed *and* the task has been attempted max_attempts times, no further attempts will be made and the task will be deleted. If zero, then the task age is unlimited. If unspecified when the queue is created, Cloud Tasks will pick the default. `max_retry_duration` will be truncated to the nearest second. This field has the same meaning as [task_age_limit in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
         * 
         * @return builder
         * 
         */
        public Builder maxRetryDuration(String maxRetryDuration) {
            $.maxRetryDuration = maxRetryDuration;
            return this;
        }

        /**
         * @param minBackoff A task will be scheduled for retry between min_backoff and max_backoff duration after it fails, if the queue&#39;s RetryConfig specifies that the task should be retried. If unspecified when the queue is created, Cloud Tasks will pick the default. `min_backoff` will be truncated to the nearest second. This field has the same meaning as [min_backoff_seconds in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
         * 
         * @return builder
         * 
         */
        public Builder minBackoff(String minBackoff) {
            $.minBackoff = minBackoff;
            return this;
        }

        public RetryConfigResponse build() {
            $.maxAttempts = Objects.requireNonNull($.maxAttempts, "expected parameter 'maxAttempts' to be non-null");
            $.maxBackoff = Objects.requireNonNull($.maxBackoff, "expected parameter 'maxBackoff' to be non-null");
            $.maxDoublings = Objects.requireNonNull($.maxDoublings, "expected parameter 'maxDoublings' to be non-null");
            $.maxRetryDuration = Objects.requireNonNull($.maxRetryDuration, "expected parameter 'maxRetryDuration' to be non-null");
            $.minBackoff = Objects.requireNonNull($.minBackoff, "expected parameter 'minBackoff' to be non-null");
            return $;
        }
    }

}
