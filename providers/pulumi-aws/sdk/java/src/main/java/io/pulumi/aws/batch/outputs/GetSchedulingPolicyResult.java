// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.outputs;

import io.pulumi.aws.batch.outputs.GetSchedulingPolicyFairSharePolicy;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSchedulingPolicyResult {
    private final String arn;
    private final List<GetSchedulingPolicyFairSharePolicy> fairSharePolicies;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Specifies the name of the scheduling policy.
     * 
     */
    private final String name;
    /**
     * Key-value map of resource tags
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetSchedulingPolicyResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("fairSharePolicies") List<GetSchedulingPolicyFairSharePolicy> fairSharePolicies,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.fairSharePolicies = fairSharePolicies;
        this.id = id;
        this.name = name;
        this.tags = tags;
    }

    public String arn() {
        return this.arn;
    }
    public List<GetSchedulingPolicyFairSharePolicy> fairSharePolicies() {
        return this.fairSharePolicies;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Specifies the name of the scheduling policy.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Key-value map of resource tags
     * 
    */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchedulingPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private List<GetSchedulingPolicyFairSharePolicy> fairSharePolicies;
        private String id;
        private String name;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSchedulingPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fairSharePolicies = defaults.fairSharePolicies;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder fairSharePolicies(List<GetSchedulingPolicyFairSharePolicy> fairSharePolicies) {
            this.fairSharePolicies = Objects.requireNonNull(fairSharePolicies);
            return this;
        }
        public Builder fairSharePolicies(GetSchedulingPolicyFairSharePolicy... fairSharePolicies) {
            return fairSharePolicies(List.of(fairSharePolicies));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetSchedulingPolicyResult build() {
            return new GetSchedulingPolicyResult(arn, fairSharePolicies, id, name, tags);
        }
    }
}
