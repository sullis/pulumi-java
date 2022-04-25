// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.azurenative.synapse.outputs.SecureStringResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CmdkeySetupResponse {
    /**
     * @return The password of data source access.
     * 
     */
    private final SecureStringResponse password;
    /**
     * @return The server name of data source access.
     * 
     */
    private final Object targetName;
    /**
     * @return The type of custom setup.
     * Expected value is &#39;CmdkeySetup&#39;.
     * 
     */
    private final String type;
    /**
     * @return The user name of data source access.
     * 
     */
    private final Object userName;

    @CustomType.Constructor
    private CmdkeySetupResponse(
        @CustomType.Parameter("password") SecureStringResponse password,
        @CustomType.Parameter("targetName") Object targetName,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userName") Object userName) {
        this.password = password;
        this.targetName = targetName;
        this.type = type;
        this.userName = userName;
    }

    /**
     * @return The password of data source access.
     * 
     */
    public SecureStringResponse password() {
        return this.password;
    }
    /**
     * @return The server name of data source access.
     * 
     */
    public Object targetName() {
        return this.targetName;
    }
    /**
     * @return The type of custom setup.
     * Expected value is &#39;CmdkeySetup&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The user name of data source access.
     * 
     */
    public Object userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CmdkeySetupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecureStringResponse password;
        private Object targetName;
        private String type;
        private Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(CmdkeySetupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.targetName = defaults.targetName;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder password(SecureStringResponse password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder targetName(Object targetName) {
            this.targetName = Objects.requireNonNull(targetName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userName(Object userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }        public CmdkeySetupResponse build() {
            return new CmdkeySetupResponse(password, targetName, type, userName);
        }
    }
}
