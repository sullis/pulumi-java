// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ForwardingRuleServiceDirectoryRegistrationResponse {
    /**
     * @return Service Directory namespace to register the forwarding rule under.
     * 
     */
    private final String namespace;
    /**
     * @return Service Directory service to register the forwarding rule under.
     * 
     */
    private final String service;
    /**
     * @return [Optional] Service Directory region to register this global forwarding rule under. Default to &#34;us-central1&#34;. Only used for PSC for Google APIs. All PSC for Google APIs Forwarding Rules on the same network should use the same Service Directory region.
     * 
     */
    private final String serviceDirectoryRegion;

    @CustomType.Constructor
    private ForwardingRuleServiceDirectoryRegistrationResponse(
        @CustomType.Parameter("namespace") String namespace,
        @CustomType.Parameter("service") String service,
        @CustomType.Parameter("serviceDirectoryRegion") String serviceDirectoryRegion) {
        this.namespace = namespace;
        this.service = service;
        this.serviceDirectoryRegion = serviceDirectoryRegion;
    }

    /**
     * @return Service Directory namespace to register the forwarding rule under.
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return Service Directory service to register the forwarding rule under.
     * 
     */
    public String service() {
        return this.service;
    }
    /**
     * @return [Optional] Service Directory region to register this global forwarding rule under. Default to &#34;us-central1&#34;. Only used for PSC for Google APIs. All PSC for Google APIs Forwarding Rules on the same network should use the same Service Directory region.
     * 
     */
    public String serviceDirectoryRegion() {
        return this.serviceDirectoryRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForwardingRuleServiceDirectoryRegistrationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namespace;
        private String service;
        private String serviceDirectoryRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(ForwardingRuleServiceDirectoryRegistrationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
    	      this.service = defaults.service;
    	      this.serviceDirectoryRegion = defaults.serviceDirectoryRegion;
        }

        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder serviceDirectoryRegion(String serviceDirectoryRegion) {
            this.serviceDirectoryRegion = Objects.requireNonNull(serviceDirectoryRegion);
            return this;
        }        public ForwardingRuleServiceDirectoryRegistrationResponse build() {
            return new ForwardingRuleServiceDirectoryRegistrationResponse(namespace, service, serviceDirectoryRegion);
        }
    }
}
