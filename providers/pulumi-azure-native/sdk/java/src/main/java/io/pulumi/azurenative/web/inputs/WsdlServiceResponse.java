// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The service with name and endpoint names
 * 
 */
public final class WsdlServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final WsdlServiceResponse Empty = new WsdlServiceResponse();

    /**
     * List of the endpoints' qualified names
     * 
     */
    @InputImport(name="endpointQualifiedNames")
    private final @Nullable List<String> endpointQualifiedNames;

    public List<String> getEndpointQualifiedNames() {
        return this.endpointQualifiedNames == null ? List.of() : this.endpointQualifiedNames;
    }

    /**
     * The service's qualified name
     * 
     */
    @InputImport(name="qualifiedName", required=true)
    private final String qualifiedName;

    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public WsdlServiceResponse(
        @Nullable List<String> endpointQualifiedNames,
        String qualifiedName) {
        this.endpointQualifiedNames = endpointQualifiedNames;
        this.qualifiedName = Objects.requireNonNull(qualifiedName, "expected parameter 'qualifiedName' to be non-null");
    }

    private WsdlServiceResponse() {
        this.endpointQualifiedNames = List.of();
        this.qualifiedName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WsdlServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> endpointQualifiedNames;
        private String qualifiedName;

        public Builder() {
    	      // Empty
        }

        public Builder(WsdlServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointQualifiedNames = defaults.endpointQualifiedNames;
    	      this.qualifiedName = defaults.qualifiedName;
        }

        public Builder setEndpointQualifiedNames(@Nullable List<String> endpointQualifiedNames) {
            this.endpointQualifiedNames = endpointQualifiedNames;
            return this;
        }

        public Builder setQualifiedName(String qualifiedName) {
            this.qualifiedName = Objects.requireNonNull(qualifiedName);
            return this;
        }

        public WsdlServiceResponse build() {
            return new WsdlServiceResponse(endpointQualifiedNames, qualifiedName);
        }
    }
}
