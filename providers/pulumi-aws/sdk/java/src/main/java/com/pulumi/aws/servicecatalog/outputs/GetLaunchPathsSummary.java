// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.outputs;

import com.pulumi.aws.servicecatalog.outputs.GetLaunchPathsSummaryConstraintSummary;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetLaunchPathsSummary {
    /**
     * @return Block for constraints on the portfolio-product relationship. See details below.
     * 
     */
    private final List<GetLaunchPathsSummaryConstraintSummary> constraintSummaries;
    /**
     * @return Name of the portfolio to which the path was assigned.
     * 
     */
    private final String name;
    /**
     * @return Identifier of the product path.
     * 
     */
    private final String pathId;
    /**
     * @return Tags associated with this product path.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetLaunchPathsSummary(
        @CustomType.Parameter("constraintSummaries") List<GetLaunchPathsSummaryConstraintSummary> constraintSummaries,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("pathId") String pathId,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.constraintSummaries = constraintSummaries;
        this.name = name;
        this.pathId = pathId;
        this.tags = tags;
    }

    /**
     * @return Block for constraints on the portfolio-product relationship. See details below.
     * 
     */
    public List<GetLaunchPathsSummaryConstraintSummary> constraintSummaries() {
        return this.constraintSummaries;
    }
    /**
     * @return Name of the portfolio to which the path was assigned.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Identifier of the product path.
     * 
     */
    public String pathId() {
        return this.pathId;
    }
    /**
     * @return Tags associated with this product path.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchPathsSummary defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetLaunchPathsSummaryConstraintSummary> constraintSummaries;
        private String name;
        private String pathId;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchPathsSummary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constraintSummaries = defaults.constraintSummaries;
    	      this.name = defaults.name;
    	      this.pathId = defaults.pathId;
    	      this.tags = defaults.tags;
        }

        public Builder constraintSummaries(List<GetLaunchPathsSummaryConstraintSummary> constraintSummaries) {
            this.constraintSummaries = Objects.requireNonNull(constraintSummaries);
            return this;
        }
        public Builder constraintSummaries(GetLaunchPathsSummaryConstraintSummary... constraintSummaries) {
            return constraintSummaries(List.of(constraintSummaries));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder pathId(String pathId) {
            this.pathId = Objects.requireNonNull(pathId);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetLaunchPathsSummary build() {
            return new GetLaunchPathsSummary(constraintSummaries, name, pathId, tags);
        }
    }
}
