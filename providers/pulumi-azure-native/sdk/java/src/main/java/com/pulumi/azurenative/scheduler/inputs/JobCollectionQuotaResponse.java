// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.inputs;

import com.pulumi.azurenative.scheduler.inputs.JobMaxRecurrenceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobCollectionQuotaResponse extends com.pulumi.resources.InvokeArgs {

    public static final JobCollectionQuotaResponse Empty = new JobCollectionQuotaResponse();

    /**
     * Gets or set the maximum job count.
     * 
     */
    @Import(name="maxJobCount")
    private @Nullable Integer maxJobCount;

    /**
     * @return Gets or set the maximum job count.
     * 
     */
    public Optional<Integer> maxJobCount() {
        return Optional.ofNullable(this.maxJobCount);
    }

    /**
     * Gets or sets the maximum job occurrence.
     * 
     */
    @Import(name="maxJobOccurrence")
    private @Nullable Integer maxJobOccurrence;

    /**
     * @return Gets or sets the maximum job occurrence.
     * 
     */
    public Optional<Integer> maxJobOccurrence() {
        return Optional.ofNullable(this.maxJobOccurrence);
    }

    /**
     * Gets or set the maximum recurrence.
     * 
     */
    @Import(name="maxRecurrence")
    private @Nullable JobMaxRecurrenceResponse maxRecurrence;

    /**
     * @return Gets or set the maximum recurrence.
     * 
     */
    public Optional<JobMaxRecurrenceResponse> maxRecurrence() {
        return Optional.ofNullable(this.maxRecurrence);
    }

    private JobCollectionQuotaResponse() {}

    private JobCollectionQuotaResponse(JobCollectionQuotaResponse $) {
        this.maxJobCount = $.maxJobCount;
        this.maxJobOccurrence = $.maxJobOccurrence;
        this.maxRecurrence = $.maxRecurrence;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobCollectionQuotaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobCollectionQuotaResponse $;

        public Builder() {
            $ = new JobCollectionQuotaResponse();
        }

        public Builder(JobCollectionQuotaResponse defaults) {
            $ = new JobCollectionQuotaResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxJobCount Gets or set the maximum job count.
         * 
         * @return builder
         * 
         */
        public Builder maxJobCount(@Nullable Integer maxJobCount) {
            $.maxJobCount = maxJobCount;
            return this;
        }

        /**
         * @param maxJobOccurrence Gets or sets the maximum job occurrence.
         * 
         * @return builder
         * 
         */
        public Builder maxJobOccurrence(@Nullable Integer maxJobOccurrence) {
            $.maxJobOccurrence = maxJobOccurrence;
            return this;
        }

        /**
         * @param maxRecurrence Gets or set the maximum recurrence.
         * 
         * @return builder
         * 
         */
        public Builder maxRecurrence(@Nullable JobMaxRecurrenceResponse maxRecurrence) {
            $.maxRecurrence = maxRecurrence;
            return this;
        }

        public JobCollectionQuotaResponse build() {
            return $;
        }
    }

}
