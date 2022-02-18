// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LogzOrganizationPropertiesResponse {
    /**
     * Name of the Logz organization.
     * 
     */
    private final @Nullable String companyName;
    /**
     * The Id of the Enterprise App used for Single sign on.
     * 
     */
    private final @Nullable String enterpriseAppId;
    /**
     * Id of the Logz organization.
     * 
     */
    private final String id;
    /**
     * The login URL specific to this Logz Organization.
     * 
     */
    private final @Nullable String singleSignOnUrl;

    @OutputCustomType.Constructor({"companyName","enterpriseAppId","id","singleSignOnUrl"})
    private LogzOrganizationPropertiesResponse(
        @Nullable String companyName,
        @Nullable String enterpriseAppId,
        String id,
        @Nullable String singleSignOnUrl) {
        this.companyName = companyName;
        this.enterpriseAppId = enterpriseAppId;
        this.id = Objects.requireNonNull(id);
        this.singleSignOnUrl = singleSignOnUrl;
    }

    /**
     * Name of the Logz organization.
     * 
     */
    public Optional<String> getCompanyName() {
        return Optional.ofNullable(this.companyName);
    }
    /**
     * The Id of the Enterprise App used for Single sign on.
     * 
     */
    public Optional<String> getEnterpriseAppId() {
        return Optional.ofNullable(this.enterpriseAppId);
    }
    /**
     * Id of the Logz organization.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The login URL specific to this Logz Organization.
     * 
     */
    public Optional<String> getSingleSignOnUrl() {
        return Optional.ofNullable(this.singleSignOnUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogzOrganizationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String companyName;
        private @Nullable String enterpriseAppId;
        private String id;
        private @Nullable String singleSignOnUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(LogzOrganizationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.companyName = defaults.companyName;
    	      this.enterpriseAppId = defaults.enterpriseAppId;
    	      this.id = defaults.id;
    	      this.singleSignOnUrl = defaults.singleSignOnUrl;
        }

        public Builder setCompanyName(@Nullable String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder setEnterpriseAppId(@Nullable String enterpriseAppId) {
            this.enterpriseAppId = enterpriseAppId;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setSingleSignOnUrl(@Nullable String singleSignOnUrl) {
            this.singleSignOnUrl = singleSignOnUrl;
            return this;
        }

        public LogzOrganizationPropertiesResponse build() {
            return new LogzOrganizationPropertiesResponse(companyName, enterpriseAppId, id, singleSignOnUrl);
        }
    }
}
