// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Credential details of the shares in account.
 * 
 */
public final class ShareCredentialDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ShareCredentialDetailsResponse Empty = new ShareCredentialDetailsResponse();

    /**
     * Password for the share.
     * 
     */
    @InputImport(name="password", required=true)
    private final String password;

    public String getPassword() {
        return this.password;
    }

    /**
     * Name of the share.
     * 
     */
    @InputImport(name="shareName", required=true)
    private final String shareName;

    public String getShareName() {
        return this.shareName;
    }

    /**
     * Type of the share.
     * 
     */
    @InputImport(name="shareType", required=true)
    private final String shareType;

    public String getShareType() {
        return this.shareType;
    }

    /**
     * Access protocols supported on the device.
     * 
     */
    @InputImport(name="supportedAccessProtocols", required=true)
    private final List<String> supportedAccessProtocols;

    public List<String> getSupportedAccessProtocols() {
        return this.supportedAccessProtocols;
    }

    /**
     * User name for the share.
     * 
     */
    @InputImport(name="userName", required=true)
    private final String userName;

    public String getUserName() {
        return this.userName;
    }

    public ShareCredentialDetailsResponse(
        String password,
        String shareName,
        String shareType,
        List<String> supportedAccessProtocols,
        String userName) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
        this.shareType = Objects.requireNonNull(shareType, "expected parameter 'shareType' to be non-null");
        this.supportedAccessProtocols = Objects.requireNonNull(supportedAccessProtocols, "expected parameter 'supportedAccessProtocols' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private ShareCredentialDetailsResponse() {
        this.password = null;
        this.shareName = null;
        this.shareType = null;
        this.supportedAccessProtocols = List.of();
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareCredentialDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String shareName;
        private String shareType;
        private List<String> supportedAccessProtocols;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareCredentialDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.shareName = defaults.shareName;
    	      this.shareType = defaults.shareType;
    	      this.supportedAccessProtocols = defaults.supportedAccessProtocols;
    	      this.userName = defaults.userName;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setShareName(String shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }

        public Builder setShareType(String shareType) {
            this.shareType = Objects.requireNonNull(shareType);
            return this;
        }

        public Builder setSupportedAccessProtocols(List<String> supportedAccessProtocols) {
            this.supportedAccessProtocols = Objects.requireNonNull(supportedAccessProtocols);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public ShareCredentialDetailsResponse build() {
            return new ShareCredentialDetailsResponse(password, shareName, shareType, supportedAccessProtocols, userName);
        }
    }
}
