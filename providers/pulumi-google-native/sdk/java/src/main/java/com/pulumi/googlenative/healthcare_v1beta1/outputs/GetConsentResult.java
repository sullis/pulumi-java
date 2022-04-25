// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.healthcare_v1beta1.outputs.GoogleCloudHealthcareV1beta1ConsentPolicyResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetConsentResult {
    /**
     * @return The resource name of the Consent artifact that contains proof of the end user&#39;s consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`.
     * 
     */
    private final String consentArtifact;
    /**
     * @return Timestamp in UTC of when this Consent is considered expired.
     * 
     */
    private final String expireTime;
    /**
     * @return Optional. User-supplied key-value pairs used to organize Consent resources. Metadata keys must: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - begin with a letter - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes Metadata values must be: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes No more than 64 metadata entries can be associated with a given consent.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * @return Resource name of the Consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consents/{consent_id}`. Cannot be changed after creation.
     * 
     */
    private final String name;
    /**
     * @return Optional. Represents a user&#39;s consent in terms of the resources that can be accessed and under what conditions.
     * 
     */
    private final List<GoogleCloudHealthcareV1beta1ConsentPolicyResponse> policies;
    /**
     * @return The timestamp that the revision was created.
     * 
     */
    private final String revisionCreateTime;
    /**
     * @return The revision ID of the Consent. The format is an 8-character hexadecimal string. Refer to a specific revision of a Consent by appending `@{revision_id}` to the Consent&#39;s resource name.
     * 
     */
    private final String revisionId;
    /**
     * @return Indicates the current state of this Consent.
     * 
     */
    private final String state;
    /**
     * @return Input only. The time to live for this Consent from when it is created.
     * 
     */
    private final String ttl;
    /**
     * @return User&#39;s UUID provided by the client.
     * 
     */
    private final String userId;

    @CustomType.Constructor
    private GetConsentResult(
        @CustomType.Parameter("consentArtifact") String consentArtifact,
        @CustomType.Parameter("expireTime") String expireTime,
        @CustomType.Parameter("metadata") Map<String,String> metadata,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("policies") List<GoogleCloudHealthcareV1beta1ConsentPolicyResponse> policies,
        @CustomType.Parameter("revisionCreateTime") String revisionCreateTime,
        @CustomType.Parameter("revisionId") String revisionId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("ttl") String ttl,
        @CustomType.Parameter("userId") String userId) {
        this.consentArtifact = consentArtifact;
        this.expireTime = expireTime;
        this.metadata = metadata;
        this.name = name;
        this.policies = policies;
        this.revisionCreateTime = revisionCreateTime;
        this.revisionId = revisionId;
        this.state = state;
        this.ttl = ttl;
        this.userId = userId;
    }

    /**
     * @return The resource name of the Consent artifact that contains proof of the end user&#39;s consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`.
     * 
     */
    public String consentArtifact() {
        return this.consentArtifact;
    }
    /**
     * @return Timestamp in UTC of when this Consent is considered expired.
     * 
     */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * @return Optional. User-supplied key-value pairs used to organize Consent resources. Metadata keys must: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - begin with a letter - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes Metadata values must be: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes No more than 64 metadata entries can be associated with a given consent.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata;
    }
    /**
     * @return Resource name of the Consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consents/{consent_id}`. Cannot be changed after creation.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Optional. Represents a user&#39;s consent in terms of the resources that can be accessed and under what conditions.
     * 
     */
    public List<GoogleCloudHealthcareV1beta1ConsentPolicyResponse> policies() {
        return this.policies;
    }
    /**
     * @return The timestamp that the revision was created.
     * 
     */
    public String revisionCreateTime() {
        return this.revisionCreateTime;
    }
    /**
     * @return The revision ID of the Consent. The format is an 8-character hexadecimal string. Refer to a specific revision of a Consent by appending `@{revision_id}` to the Consent&#39;s resource name.
     * 
     */
    public String revisionId() {
        return this.revisionId;
    }
    /**
     * @return Indicates the current state of this Consent.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Input only. The time to live for this Consent from when it is created.
     * 
     */
    public String ttl() {
        return this.ttl;
    }
    /**
     * @return User&#39;s UUID provided by the client.
     * 
     */
    public String userId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConsentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consentArtifact;
        private String expireTime;
        private Map<String,String> metadata;
        private String name;
        private List<GoogleCloudHealthcareV1beta1ConsentPolicyResponse> policies;
        private String revisionCreateTime;
        private String revisionId;
        private String state;
        private String ttl;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConsentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consentArtifact = defaults.consentArtifact;
    	      this.expireTime = defaults.expireTime;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.policies = defaults.policies;
    	      this.revisionCreateTime = defaults.revisionCreateTime;
    	      this.revisionId = defaults.revisionId;
    	      this.state = defaults.state;
    	      this.ttl = defaults.ttl;
    	      this.userId = defaults.userId;
        }

        public Builder consentArtifact(String consentArtifact) {
            this.consentArtifact = Objects.requireNonNull(consentArtifact);
            return this;
        }
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policies(List<GoogleCloudHealthcareV1beta1ConsentPolicyResponse> policies) {
            this.policies = Objects.requireNonNull(policies);
            return this;
        }
        public Builder policies(GoogleCloudHealthcareV1beta1ConsentPolicyResponse... policies) {
            return policies(List.of(policies));
        }
        public Builder revisionCreateTime(String revisionCreateTime) {
            this.revisionCreateTime = Objects.requireNonNull(revisionCreateTime);
            return this;
        }
        public Builder revisionId(String revisionId) {
            this.revisionId = Objects.requireNonNull(revisionId);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder ttl(String ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }        public GetConsentResult build() {
            return new GetConsentResult(consentArtifact, expireTime, metadata, name, policies, revisionCreateTime, revisionId, state, ttl, userId);
        }
    }
}
