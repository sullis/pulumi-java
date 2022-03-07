// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetClustersResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Set of EKS clusters names
     * 
     */
    private final List<String> names;

    @OutputCustomType.Constructor({"id","names"})
    private GetClustersResult(
        String id,
        List<String> names) {
        this.id = Objects.requireNonNull(id);
        this.names = Objects.requireNonNull(names);
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Set of EKS clusters names
     * 
    */
    public List<String> getNames() {
        return this.names;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClustersResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> names;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClustersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.names = defaults.names;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setNames(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public GetClustersResult build() {
            return new GetClustersResult(id, names);
        }
    }
}