// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.JobTemplateRetryCriteria;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobExecutionsRetryConfigProperties extends io.pulumi.resources.InvokeArgs {

    public static final JobExecutionsRetryConfigProperties Empty = new JobExecutionsRetryConfigProperties();

    @InputImport(name="retryCriteriaList")
    private final @Nullable List<JobTemplateRetryCriteria> retryCriteriaList;

    public List<JobTemplateRetryCriteria> getRetryCriteriaList() {
        return this.retryCriteriaList == null ? List.of() : this.retryCriteriaList;
    }

    public JobExecutionsRetryConfigProperties(@Nullable List<JobTemplateRetryCriteria> retryCriteriaList) {
        this.retryCriteriaList = retryCriteriaList;
    }

    private JobExecutionsRetryConfigProperties() {
        this.retryCriteriaList = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobExecutionsRetryConfigProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<JobTemplateRetryCriteria> retryCriteriaList;

        public Builder() {
    	      // Empty
        }

        public Builder(JobExecutionsRetryConfigProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retryCriteriaList = defaults.retryCriteriaList;
        }

        public Builder setRetryCriteriaList(@Nullable List<JobTemplateRetryCriteria> retryCriteriaList) {
            this.retryCriteriaList = retryCriteriaList;
            return this;
        }

        public JobExecutionsRetryConfigProperties build() {
            return new JobExecutionsRetryConfigProperties(retryCriteriaList);
        }
    }
}
