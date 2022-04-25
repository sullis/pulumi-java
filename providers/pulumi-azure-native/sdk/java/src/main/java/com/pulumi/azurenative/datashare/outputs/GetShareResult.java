// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.outputs;

import com.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetShareResult {
    /**
     * @return Time at which the share was created.
     * 
     */
    private final String createdAt;
    /**
     * @return Share description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * @return Name of the azure resource
     * 
     */
    private final String name;
    /**
     * @return Gets or sets the provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * @return Share kind.
     * 
     */
    private final @Nullable String shareKind;
    /**
     * @return System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Share terms.
     * 
     */
    private final @Nullable String terms;
    /**
     * @return Type of the azure resource
     * 
     */
    private final String type;
    /**
     * @return Email of the user who created the resource
     * 
     */
    private final String userEmail;
    /**
     * @return Name of the user who created the resource
     * 
     */
    private final String userName;

    @CustomType.Constructor
    private GetShareResult(
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("shareKind") @Nullable String shareKind,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("terms") @Nullable String terms,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userEmail") String userEmail,
        @CustomType.Parameter("userName") String userName) {
        this.createdAt = createdAt;
        this.description = description;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.shareKind = shareKind;
        this.systemData = systemData;
        this.terms = terms;
        this.type = type;
        this.userEmail = userEmail;
        this.userName = userName;
    }

    /**
     * @return Time at which the share was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Share description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The resource id of the azure resource
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the azure resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Gets or sets the provisioning state
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Share kind.
     * 
     */
    public Optional<String> shareKind() {
        return Optional.ofNullable(this.shareKind);
    }
    /**
     * @return System Data of the Azure resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Share terms.
     * 
     */
    public Optional<String> terms() {
        return Optional.ofNullable(this.terms);
    }
    /**
     * @return Type of the azure resource
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Email of the user who created the resource
     * 
     */
    public String userEmail() {
        return this.userEmail;
    }
    /**
     * @return Name of the user who created the resource
     * 
     */
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetShareResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private @Nullable String description;
        private String id;
        private String name;
        private String provisioningState;
        private @Nullable String shareKind;
        private SystemDataResponse systemData;
        private @Nullable String terms;
        private String type;
        private String userEmail;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetShareResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.shareKind = defaults.shareKind;
    	      this.systemData = defaults.systemData;
    	      this.terms = defaults.terms;
    	      this.type = defaults.type;
    	      this.userEmail = defaults.userEmail;
    	      this.userName = defaults.userName;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder shareKind(@Nullable String shareKind) {
            this.shareKind = shareKind;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder terms(@Nullable String terms) {
            this.terms = terms;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userEmail(String userEmail) {
            this.userEmail = Objects.requireNonNull(userEmail);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }        public GetShareResult build() {
            return new GetShareResult(createdAt, description, id, name, provisioningState, shareKind, systemData, terms, type, userEmail, userName);
        }
    }
}
