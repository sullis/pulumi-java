// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebasehosting_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DomainRedirectResponse {
    /**
     * @return The domain name to redirect to.
     * 
     */
    private final String domainName;
    /**
     * @return The redirect status code.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private DomainRedirectResponse(
        @CustomType.Parameter("domainName") String domainName,
        @CustomType.Parameter("type") String type) {
        this.domainName = domainName;
        this.type = type;
    }

    /**
     * @return The domain name to redirect to.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return The redirect status code.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainRedirectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainRedirectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.type = defaults.type;
        }

        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DomainRedirectResponse build() {
            return new DomainRedirectResponse(domainName, type);
        }
    }
}
