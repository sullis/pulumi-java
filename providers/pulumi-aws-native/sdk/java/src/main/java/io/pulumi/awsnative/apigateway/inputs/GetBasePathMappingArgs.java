// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBasePathMappingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBasePathMappingArgs Empty = new GetBasePathMappingArgs();

    /**
     * The base path name that callers of the API must provide in the URL after the domain name.
     * 
     */
    @InputImport(name="basePath", required=true)
    private final String basePath;

    public String getBasePath() {
        return this.basePath;
    }

    /**
     * The DomainName of an AWS::ApiGateway::DomainName resource.
     * 
     */
    @InputImport(name="domainName", required=true)
    private final String domainName;

    public String getDomainName() {
        return this.domainName;
    }

    public GetBasePathMappingArgs(
        String basePath,
        String domainName) {
        this.basePath = Objects.requireNonNull(basePath, "expected parameter 'basePath' to be non-null");
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
    }

    private GetBasePathMappingArgs() {
        this.basePath = null;
        this.domainName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBasePathMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String basePath;
        private String domainName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBasePathMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basePath = defaults.basePath;
    	      this.domainName = defaults.domainName;
        }

        public Builder setBasePath(String basePath) {
            this.basePath = Objects.requireNonNull(basePath);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public GetBasePathMappingArgs build() {
            return new GetBasePathMappingArgs(basePath, domainName);
        }
    }
}
