// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContainerRegistryCredentialsResponse {
    /**
     * The ACR login server name. User name is the first part of the FQDN.
     * 
     */
    private final String loginServer;
    /**
     * The ACR primary password.
     * 
     */
    private final String password;
    /**
     * The ACR secondary password.
     * 
     */
    private final String password2;
    /**
     * The ACR login username.
     * 
     */
    private final String username;

    @OutputCustomType.Constructor({"loginServer","password","password2","username"})
    private ContainerRegistryCredentialsResponse(
        String loginServer,
        String password,
        String password2,
        String username) {
        this.loginServer = Objects.requireNonNull(loginServer);
        this.password = Objects.requireNonNull(password);
        this.password2 = Objects.requireNonNull(password2);
        this.username = Objects.requireNonNull(username);
    }

    /**
     * The ACR login server name. User name is the first part of the FQDN.
     * 
    */
    public String getLoginServer() {
        return this.loginServer;
    }
    /**
     * The ACR primary password.
     * 
    */
    public String getPassword() {
        return this.password;
    }
    /**
     * The ACR secondary password.
     * 
    */
    public String getPassword2() {
        return this.password2;
    }
    /**
     * The ACR login username.
     * 
    */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRegistryCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String loginServer;
        private String password;
        private String password2;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRegistryCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loginServer = defaults.loginServer;
    	      this.password = defaults.password;
    	      this.password2 = defaults.password2;
    	      this.username = defaults.username;
        }

        public Builder setLoginServer(String loginServer) {
            this.loginServer = Objects.requireNonNull(loginServer);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPassword2(String password2) {
            this.password2 = Objects.requireNonNull(password2);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public ContainerRegistryCredentialsResponse build() {
            return new ContainerRegistryCredentialsResponse(loginServer, password, password2, username);
        }
    }
}