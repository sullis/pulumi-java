// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.outputs.JobTemplateAbortCriteria;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AbortConfigProperties {
    private final List<JobTemplateAbortCriteria> criteriaList;

    @OutputCustomType.Constructor({"criteriaList"})
    private AbortConfigProperties(List<JobTemplateAbortCriteria> criteriaList) {
        this.criteriaList = Objects.requireNonNull(criteriaList);
    }

    public List<JobTemplateAbortCriteria> getCriteriaList() {
        return this.criteriaList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AbortConfigProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<JobTemplateAbortCriteria> criteriaList;

        public Builder() {
    	      // Empty
        }

        public Builder(AbortConfigProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criteriaList = defaults.criteriaList;
        }

        public Builder setCriteriaList(List<JobTemplateAbortCriteria> criteriaList) {
            this.criteriaList = Objects.requireNonNull(criteriaList);
            return this;
        }

        public AbortConfigProperties build() {
            return new AbortConfigProperties(criteriaList);
        }
    }
}
