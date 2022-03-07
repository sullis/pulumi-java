// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDomainMappingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainMappingArgs Empty = new GetDomainMappingArgs();

    @InputImport(name="appId", required=true)
      private final String appId;

    public String getAppId() {
        return this.appId;
    }

    @InputImport(name="domainMappingId", required=true)
      private final String domainMappingId;

    public String getDomainMappingId() {
        return this.domainMappingId;
    }

    public GetDomainMappingArgs(
        String appId,
        String domainMappingId) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.domainMappingId = Objects.requireNonNull(domainMappingId, "expected parameter 'domainMappingId' to be non-null");
    }

    private GetDomainMappingArgs() {
        this.appId = null;
        this.domainMappingId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private String domainMappingId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.domainMappingId = defaults.domainMappingId;
        }

        public Builder setAppId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder setDomainMappingId(String domainMappingId) {
            this.domainMappingId = Objects.requireNonNull(domainMappingId);
            return this;
        }
        public GetDomainMappingArgs build() {
            return new GetDomainMappingArgs(appId, domainMappingId);
        }
    }
}