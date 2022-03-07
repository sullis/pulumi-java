// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.outputs;

import io.pulumi.aws.signer.outputs.GetSigningJobRevocationRecord;
import io.pulumi.aws.signer.outputs.GetSigningJobSignedObject;
import io.pulumi.aws.signer.outputs.GetSigningJobSource;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetSigningJobResult {
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was completed.
     * 
     */
    private final String completedAt;
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was created.
     * 
     */
    private final String createdAt;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String jobId;
    /**
     * The IAM entity that initiated the signing job.
     * 
     */
    private final String jobInvoker;
    /**
     * The AWS account ID of the job owner.
     * 
     */
    private final String jobOwner;
    /**
     * A human-readable name for the signing platform associated with the signing job.
     * 
     */
    private final String platformDisplayName;
    /**
     * The platform to which your signed code image will be distributed.
     * 
     */
    private final String platformId;
    /**
     * The name of the profile that initiated the signing operation.
     * 
     */
    private final String profileName;
    /**
     * The version of the signing profile used to initiate the signing job.
     * 
     */
    private final String profileVersion;
    /**
     * The IAM principal that requested the signing job.
     * 
     */
    private final String requestedBy;
    /**
     * A revocation record if the signature generated by the signing job has been revoked. Contains a timestamp and the ID of the IAM entity that revoked the signature.
     * 
     */
    private final List<GetSigningJobRevocationRecord> revocationRecords;
    /**
     * The time when the signature of a signing job expires.
     * 
     */
    private final String signatureExpiresAt;
    /**
     * Name of the S3 bucket where the signed code image is saved by code signing.
     * 
     */
    private final List<GetSigningJobSignedObject> signedObjects;
    /**
     * The object that contains the name of your S3 bucket or your raw code.
     * 
     */
    private final List<GetSigningJobSource> sources;
    /**
     * Status of the signing job.
     * 
     */
    private final String status;
    /**
     * String value that contains the status reason.
     * 
     */
    private final String statusReason;

    @OutputCustomType.Constructor({"completedAt","createdAt","id","jobId","jobInvoker","jobOwner","platformDisplayName","platformId","profileName","profileVersion","requestedBy","revocationRecords","signatureExpiresAt","signedObjects","sources","status","statusReason"})
    private GetSigningJobResult(
        String completedAt,
        String createdAt,
        String id,
        String jobId,
        String jobInvoker,
        String jobOwner,
        String platformDisplayName,
        String platformId,
        String profileName,
        String profileVersion,
        String requestedBy,
        List<GetSigningJobRevocationRecord> revocationRecords,
        String signatureExpiresAt,
        List<GetSigningJobSignedObject> signedObjects,
        List<GetSigningJobSource> sources,
        String status,
        String statusReason) {
        this.completedAt = Objects.requireNonNull(completedAt);
        this.createdAt = Objects.requireNonNull(createdAt);
        this.id = Objects.requireNonNull(id);
        this.jobId = Objects.requireNonNull(jobId);
        this.jobInvoker = Objects.requireNonNull(jobInvoker);
        this.jobOwner = Objects.requireNonNull(jobOwner);
        this.platformDisplayName = Objects.requireNonNull(platformDisplayName);
        this.platformId = Objects.requireNonNull(platformId);
        this.profileName = Objects.requireNonNull(profileName);
        this.profileVersion = Objects.requireNonNull(profileVersion);
        this.requestedBy = Objects.requireNonNull(requestedBy);
        this.revocationRecords = Objects.requireNonNull(revocationRecords);
        this.signatureExpiresAt = Objects.requireNonNull(signatureExpiresAt);
        this.signedObjects = Objects.requireNonNull(signedObjects);
        this.sources = Objects.requireNonNull(sources);
        this.status = Objects.requireNonNull(status);
        this.statusReason = Objects.requireNonNull(statusReason);
    }

    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was completed.
     * 
    */
    public String getCompletedAt() {
        return this.completedAt;
    }
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was created.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getJobId() {
        return this.jobId;
    }
    /**
     * The IAM entity that initiated the signing job.
     * 
    */
    public String getJobInvoker() {
        return this.jobInvoker;
    }
    /**
     * The AWS account ID of the job owner.
     * 
    */
    public String getJobOwner() {
        return this.jobOwner;
    }
    /**
     * A human-readable name for the signing platform associated with the signing job.
     * 
    */
    public String getPlatformDisplayName() {
        return this.platformDisplayName;
    }
    /**
     * The platform to which your signed code image will be distributed.
     * 
    */
    public String getPlatformId() {
        return this.platformId;
    }
    /**
     * The name of the profile that initiated the signing operation.
     * 
    */
    public String getProfileName() {
        return this.profileName;
    }
    /**
     * The version of the signing profile used to initiate the signing job.
     * 
    */
    public String getProfileVersion() {
        return this.profileVersion;
    }
    /**
     * The IAM principal that requested the signing job.
     * 
    */
    public String getRequestedBy() {
        return this.requestedBy;
    }
    /**
     * A revocation record if the signature generated by the signing job has been revoked. Contains a timestamp and the ID of the IAM entity that revoked the signature.
     * 
    */
    public List<GetSigningJobRevocationRecord> getRevocationRecords() {
        return this.revocationRecords;
    }
    /**
     * The time when the signature of a signing job expires.
     * 
    */
    public String getSignatureExpiresAt() {
        return this.signatureExpiresAt;
    }
    /**
     * Name of the S3 bucket where the signed code image is saved by code signing.
     * 
    */
    public List<GetSigningJobSignedObject> getSignedObjects() {
        return this.signedObjects;
    }
    /**
     * The object that contains the name of your S3 bucket or your raw code.
     * 
    */
    public List<GetSigningJobSource> getSources() {
        return this.sources;
    }
    /**
     * Status of the signing job.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * String value that contains the status reason.
     * 
    */
    public String getStatusReason() {
        return this.statusReason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSigningJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String completedAt;
        private String createdAt;
        private String id;
        private String jobId;
        private String jobInvoker;
        private String jobOwner;
        private String platformDisplayName;
        private String platformId;
        private String profileName;
        private String profileVersion;
        private String requestedBy;
        private List<GetSigningJobRevocationRecord> revocationRecords;
        private String signatureExpiresAt;
        private List<GetSigningJobSignedObject> signedObjects;
        private List<GetSigningJobSource> sources;
        private String status;
        private String statusReason;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSigningJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completedAt = defaults.completedAt;
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.jobId = defaults.jobId;
    	      this.jobInvoker = defaults.jobInvoker;
    	      this.jobOwner = defaults.jobOwner;
    	      this.platformDisplayName = defaults.platformDisplayName;
    	      this.platformId = defaults.platformId;
    	      this.profileName = defaults.profileName;
    	      this.profileVersion = defaults.profileVersion;
    	      this.requestedBy = defaults.requestedBy;
    	      this.revocationRecords = defaults.revocationRecords;
    	      this.signatureExpiresAt = defaults.signatureExpiresAt;
    	      this.signedObjects = defaults.signedObjects;
    	      this.sources = defaults.sources;
    	      this.status = defaults.status;
    	      this.statusReason = defaults.statusReason;
        }

        public Builder setCompletedAt(String completedAt) {
            this.completedAt = Objects.requireNonNull(completedAt);
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setJobId(String jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }

        public Builder setJobInvoker(String jobInvoker) {
            this.jobInvoker = Objects.requireNonNull(jobInvoker);
            return this;
        }

        public Builder setJobOwner(String jobOwner) {
            this.jobOwner = Objects.requireNonNull(jobOwner);
            return this;
        }

        public Builder setPlatformDisplayName(String platformDisplayName) {
            this.platformDisplayName = Objects.requireNonNull(platformDisplayName);
            return this;
        }

        public Builder setPlatformId(String platformId) {
            this.platformId = Objects.requireNonNull(platformId);
            return this;
        }

        public Builder setProfileName(String profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public Builder setProfileVersion(String profileVersion) {
            this.profileVersion = Objects.requireNonNull(profileVersion);
            return this;
        }

        public Builder setRequestedBy(String requestedBy) {
            this.requestedBy = Objects.requireNonNull(requestedBy);
            return this;
        }

        public Builder setRevocationRecords(List<GetSigningJobRevocationRecord> revocationRecords) {
            this.revocationRecords = Objects.requireNonNull(revocationRecords);
            return this;
        }

        public Builder setSignatureExpiresAt(String signatureExpiresAt) {
            this.signatureExpiresAt = Objects.requireNonNull(signatureExpiresAt);
            return this;
        }

        public Builder setSignedObjects(List<GetSigningJobSignedObject> signedObjects) {
            this.signedObjects = Objects.requireNonNull(signedObjects);
            return this;
        }

        public Builder setSources(List<GetSigningJobSource> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatusReason(String statusReason) {
            this.statusReason = Objects.requireNonNull(statusReason);
            return this;
        }
        public GetSigningJobResult build() {
            return new GetSigningJobResult(completedAt, createdAt, id, jobId, jobInvoker, jobOwner, platformDisplayName, platformId, profileName, profileVersion, requestedBy, revocationRecords, signatureExpiresAt, signedObjects, sources, status, statusReason);
        }
    }
}