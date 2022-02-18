// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;

@OutputCustomType
public final class SSISExecutionCredentialResponse {
    /**
     * Domain for windows authentication.
     * 
     */
    private final Object domain;
    /**
     * Password for windows authentication.
     * 
     */
    private final SecureStringResponse password;
    /**
     * UseName for windows authentication.
     * 
     */
    private final Object userName;

    @OutputCustomType.Constructor({"domain","password","userName"})
    private SSISExecutionCredentialResponse(
        Object domain,
        SecureStringResponse password,
        Object userName) {
        this.domain = Objects.requireNonNull(domain);
        this.password = Objects.requireNonNull(password);
        this.userName = Objects.requireNonNull(userName);
    }

    /**
     * Domain for windows authentication.
     * 
     */
    public Object getDomain() {
        return this.domain;
    }
    /**
     * Password for windows authentication.
     * 
     */
    public SecureStringResponse getPassword() {
        return this.password;
    }
    /**
     * UseName for windows authentication.
     * 
     */
    public Object getUserName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSISExecutionCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object domain;
        private SecureStringResponse password;
        private Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SSISExecutionCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.password = defaults.password;
    	      this.userName = defaults.userName;
        }

        public Builder setDomain(Object domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder setPassword(SecureStringResponse password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setUserName(Object userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public SSISExecutionCredentialResponse build() {
            return new SSISExecutionCredentialResponse(domain, password, userName);
        }
    }
}
