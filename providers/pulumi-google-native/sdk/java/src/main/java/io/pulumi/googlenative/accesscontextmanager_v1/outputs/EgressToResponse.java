// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.accesscontextmanager_v1.outputs.ApiOperationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class EgressToResponse {
    /**
     * A list of ApiOperations allowed to be performed by the sources specified in the corresponding EgressFrom. A request matches if it uses an operation/service in this list.
     * 
     */
    private final List<ApiOperationResponse> operations;
    /**
     * A list of resources, currently only projects in the form `projects/`, that are allowed to be accessed by sources defined in the corresponding EgressFrom. A request matches if it contains a resource in this list. If `*` is specified for `resources`, then this EgressTo rule will authorize access to all resources outside the perimeter.
     * 
     */
    private final List<String> resources;

    @OutputCustomType.Constructor({"operations","resources"})
    private EgressToResponse(
        List<ApiOperationResponse> operations,
        List<String> resources) {
        this.operations = Objects.requireNonNull(operations);
        this.resources = Objects.requireNonNull(resources);
    }

    /**
     * A list of ApiOperations allowed to be performed by the sources specified in the corresponding EgressFrom. A request matches if it uses an operation/service in this list.
     * 
    */
    public List<ApiOperationResponse> getOperations() {
        return this.operations;
    }
    /**
     * A list of resources, currently only projects in the form `projects/`, that are allowed to be accessed by sources defined in the corresponding EgressFrom. A request matches if it contains a resource in this list. If `*` is specified for `resources`, then this EgressTo rule will authorize access to all resources outside the perimeter.
     * 
    */
    public List<String> getResources() {
        return this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EgressToResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ApiOperationResponse> operations;
        private List<String> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(EgressToResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operations = defaults.operations;
    	      this.resources = defaults.resources;
        }

        public Builder setOperations(List<ApiOperationResponse> operations) {
            this.operations = Objects.requireNonNull(operations);
            return this;
        }

        public Builder setResources(List<String> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public EgressToResponse build() {
            return new EgressToResponse(operations, resources);
        }
    }
}