// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.outputs;

import io.pulumi.azurenative.notificationhubs.outputs.AdmCredentialResponse;
import io.pulumi.azurenative.notificationhubs.outputs.ApnsCredentialResponse;
import io.pulumi.azurenative.notificationhubs.outputs.BaiduCredentialResponse;
import io.pulumi.azurenative.notificationhubs.outputs.GcmCredentialResponse;
import io.pulumi.azurenative.notificationhubs.outputs.MpnsCredentialResponse;
import io.pulumi.azurenative.notificationhubs.outputs.SharedAccessAuthorizationRulePropertiesResponse;
import io.pulumi.azurenative.notificationhubs.outputs.SkuResponse;
import io.pulumi.azurenative.notificationhubs.outputs.WnsCredentialResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNotificationHubResult {
    /**
     * The AdmCredential of the created NotificationHub
     * 
     */
    private final @Nullable AdmCredentialResponse admCredential;
    /**
     * The ApnsCredential of the created NotificationHub
     * 
     */
    private final @Nullable ApnsCredentialResponse apnsCredential;
    /**
     * The AuthorizationRules of the created NotificationHub
     * 
     */
    private final @Nullable List<SharedAccessAuthorizationRulePropertiesResponse> authorizationRules;
    /**
     * The BaiduCredential of the created NotificationHub
     * 
     */
    private final @Nullable BaiduCredentialResponse baiduCredential;
    /**
     * The GcmCredential of the created NotificationHub
     * 
     */
    private final @Nullable GcmCredentialResponse gcmCredential;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final @Nullable String location;
    /**
     * The MpnsCredential of the created NotificationHub
     * 
     */
    private final @Nullable MpnsCredentialResponse mpnsCredential;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * The RegistrationTtl of the created NotificationHub
     * 
     */
    private final @Nullable String registrationTtl;
    /**
     * The sku of the created namespace
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * The WnsCredential of the created NotificationHub
     * 
     */
    private final @Nullable WnsCredentialResponse wnsCredential;

    @OutputCustomType.Constructor({"admCredential","apnsCredential","authorizationRules","baiduCredential","gcmCredential","id","location","mpnsCredential","name","registrationTtl","sku","tags","type","wnsCredential"})
    private GetNotificationHubResult(
        @Nullable AdmCredentialResponse admCredential,
        @Nullable ApnsCredentialResponse apnsCredential,
        @Nullable List<SharedAccessAuthorizationRulePropertiesResponse> authorizationRules,
        @Nullable BaiduCredentialResponse baiduCredential,
        @Nullable GcmCredentialResponse gcmCredential,
        String id,
        @Nullable String location,
        @Nullable MpnsCredentialResponse mpnsCredential,
        String name,
        @Nullable String registrationTtl,
        @Nullable SkuResponse sku,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable WnsCredentialResponse wnsCredential) {
        this.admCredential = admCredential;
        this.apnsCredential = apnsCredential;
        this.authorizationRules = authorizationRules;
        this.baiduCredential = baiduCredential;
        this.gcmCredential = gcmCredential;
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.mpnsCredential = mpnsCredential;
        this.name = Objects.requireNonNull(name);
        this.registrationTtl = registrationTtl;
        this.sku = sku;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.wnsCredential = wnsCredential;
    }

    /**
     * The AdmCredential of the created NotificationHub
     * 
     */
    public Optional<AdmCredentialResponse> getAdmCredential() {
        return Optional.ofNullable(this.admCredential);
    }
    /**
     * The ApnsCredential of the created NotificationHub
     * 
     */
    public Optional<ApnsCredentialResponse> getApnsCredential() {
        return Optional.ofNullable(this.apnsCredential);
    }
    /**
     * The AuthorizationRules of the created NotificationHub
     * 
     */
    public List<SharedAccessAuthorizationRulePropertiesResponse> getAuthorizationRules() {
        return this.authorizationRules == null ? List.of() : this.authorizationRules;
    }
    /**
     * The BaiduCredential of the created NotificationHub
     * 
     */
    public Optional<BaiduCredentialResponse> getBaiduCredential() {
        return Optional.ofNullable(this.baiduCredential);
    }
    /**
     * The GcmCredential of the created NotificationHub
     * 
     */
    public Optional<GcmCredentialResponse> getGcmCredential() {
        return Optional.ofNullable(this.gcmCredential);
    }
    /**
     * Resource Id
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The MpnsCredential of the created NotificationHub
     * 
     */
    public Optional<MpnsCredentialResponse> getMpnsCredential() {
        return Optional.ofNullable(this.mpnsCredential);
    }
    /**
     * Resource name
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The RegistrationTtl of the created NotificationHub
     * 
     */
    public Optional<String> getRegistrationTtl() {
        return Optional.ofNullable(this.registrationTtl);
    }
    /**
     * The sku of the created namespace
     * 
     */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Resource tags
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The WnsCredential of the created NotificationHub
     * 
     */
    public Optional<WnsCredentialResponse> getWnsCredential() {
        return Optional.ofNullable(this.wnsCredential);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationHubResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AdmCredentialResponse admCredential;
        private @Nullable ApnsCredentialResponse apnsCredential;
        private @Nullable List<SharedAccessAuthorizationRulePropertiesResponse> authorizationRules;
        private @Nullable BaiduCredentialResponse baiduCredential;
        private @Nullable GcmCredentialResponse gcmCredential;
        private String id;
        private @Nullable String location;
        private @Nullable MpnsCredentialResponse mpnsCredential;
        private String name;
        private @Nullable String registrationTtl;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable WnsCredentialResponse wnsCredential;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNotificationHubResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admCredential = defaults.admCredential;
    	      this.apnsCredential = defaults.apnsCredential;
    	      this.authorizationRules = defaults.authorizationRules;
    	      this.baiduCredential = defaults.baiduCredential;
    	      this.gcmCredential = defaults.gcmCredential;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.mpnsCredential = defaults.mpnsCredential;
    	      this.name = defaults.name;
    	      this.registrationTtl = defaults.registrationTtl;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.wnsCredential = defaults.wnsCredential;
        }

        public Builder setAdmCredential(@Nullable AdmCredentialResponse admCredential) {
            this.admCredential = admCredential;
            return this;
        }

        public Builder setApnsCredential(@Nullable ApnsCredentialResponse apnsCredential) {
            this.apnsCredential = apnsCredential;
            return this;
        }

        public Builder setAuthorizationRules(@Nullable List<SharedAccessAuthorizationRulePropertiesResponse> authorizationRules) {
            this.authorizationRules = authorizationRules;
            return this;
        }

        public Builder setBaiduCredential(@Nullable BaiduCredentialResponse baiduCredential) {
            this.baiduCredential = baiduCredential;
            return this;
        }

        public Builder setGcmCredential(@Nullable GcmCredentialResponse gcmCredential) {
            this.gcmCredential = gcmCredential;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMpnsCredential(@Nullable MpnsCredentialResponse mpnsCredential) {
            this.mpnsCredential = mpnsCredential;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRegistrationTtl(@Nullable String registrationTtl) {
            this.registrationTtl = registrationTtl;
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWnsCredential(@Nullable WnsCredentialResponse wnsCredential) {
            this.wnsCredential = wnsCredential;
            return this;
        }

        public GetNotificationHubResult build() {
            return new GetNotificationHubResult(admCredential, apnsCredential, authorizationRules, baiduCredential, gcmCredential, id, location, mpnsCredential, name, registrationTtl, sku, tags, type, wnsCredential);
        }
    }
}
