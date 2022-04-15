// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.aws.signer.inputs.SigningJobDestinationGetArgs;
import io.pulumi.aws.signer.inputs.SigningJobRevocationRecordGetArgs;
import io.pulumi.aws.signer.inputs.SigningJobSignedObjectGetArgs;
import io.pulumi.aws.signer.inputs.SigningJobSourceGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SigningJobState extends io.pulumi.resources.ResourceArgs {

    public static final SigningJobState Empty = new SigningJobState();

    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was completed.
     * 
     */
    @Import(name="completedAt")
      private final @Nullable Output<String> completedAt;

    public Output<String> completedAt() {
        return this.completedAt == null ? Codegen.empty() : this.completedAt;
    }

    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was created.
     * 
     */
    @Import(name="createdAt")
      private final @Nullable Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt == null ? Codegen.empty() : this.createdAt;
    }

    /**
     * The S3 bucket in which to save your signed object. See Destination below for details.
     * 
     */
    @Import(name="destination")
      private final @Nullable Output<SigningJobDestinationGetArgs> destination;

    public Output<SigningJobDestinationGetArgs> destination() {
        return this.destination == null ? Codegen.empty() : this.destination;
    }

    /**
     * Set this argument to `true` to ignore signing job failures and retrieve failed status and reason. Default `false`.
     * 
     */
    @Import(name="ignoreSigningJobFailure")
      private final @Nullable Output<Boolean> ignoreSigningJobFailure;

    public Output<Boolean> ignoreSigningJobFailure() {
        return this.ignoreSigningJobFailure == null ? Codegen.empty() : this.ignoreSigningJobFailure;
    }

    /**
     * The ID of the signing job on output.
     * 
     */
    @Import(name="jobId")
      private final @Nullable Output<String> jobId;

    public Output<String> jobId() {
        return this.jobId == null ? Codegen.empty() : this.jobId;
    }

    /**
     * The IAM entity that initiated the signing job.
     * 
     */
    @Import(name="jobInvoker")
      private final @Nullable Output<String> jobInvoker;

    public Output<String> jobInvoker() {
        return this.jobInvoker == null ? Codegen.empty() : this.jobInvoker;
    }

    /**
     * The AWS account ID of the job owner.
     * 
     */
    @Import(name="jobOwner")
      private final @Nullable Output<String> jobOwner;

    public Output<String> jobOwner() {
        return this.jobOwner == null ? Codegen.empty() : this.jobOwner;
    }

    /**
     * A human-readable name for the signing platform associated with the signing job.
     * 
     */
    @Import(name="platformDisplayName")
      private final @Nullable Output<String> platformDisplayName;

    public Output<String> platformDisplayName() {
        return this.platformDisplayName == null ? Codegen.empty() : this.platformDisplayName;
    }

    /**
     * The platform to which your signed code image will be distributed.
     * 
     */
    @Import(name="platformId")
      private final @Nullable Output<String> platformId;

    public Output<String> platformId() {
        return this.platformId == null ? Codegen.empty() : this.platformId;
    }

    /**
     * The name of the profile to initiate the signing operation.
     * 
     */
    @Import(name="profileName")
      private final @Nullable Output<String> profileName;

    public Output<String> profileName() {
        return this.profileName == null ? Codegen.empty() : this.profileName;
    }

    /**
     * The version of the signing profile used to initiate the signing job.
     * 
     */
    @Import(name="profileVersion")
      private final @Nullable Output<String> profileVersion;

    public Output<String> profileVersion() {
        return this.profileVersion == null ? Codegen.empty() : this.profileVersion;
    }

    /**
     * The IAM principal that requested the signing job.
     * 
     */
    @Import(name="requestedBy")
      private final @Nullable Output<String> requestedBy;

    public Output<String> requestedBy() {
        return this.requestedBy == null ? Codegen.empty() : this.requestedBy;
    }

    /**
     * A revocation record if the signature generated by the signing job has been revoked. Contains a timestamp and the ID of the IAM entity that revoked the signature.
     * 
     */
    @Import(name="revocationRecords")
      private final @Nullable Output<List<SigningJobRevocationRecordGetArgs>> revocationRecords;

    public Output<List<SigningJobRevocationRecordGetArgs>> revocationRecords() {
        return this.revocationRecords == null ? Codegen.empty() : this.revocationRecords;
    }

    /**
     * The time when the signature of a signing job expires.
     * 
     */
    @Import(name="signatureExpiresAt")
      private final @Nullable Output<String> signatureExpiresAt;

    public Output<String> signatureExpiresAt() {
        return this.signatureExpiresAt == null ? Codegen.empty() : this.signatureExpiresAt;
    }

    /**
     * Name of the S3 bucket where the signed code image is saved by code signing.
     * 
     */
    @Import(name="signedObjects")
      private final @Nullable Output<List<SigningJobSignedObjectGetArgs>> signedObjects;

    public Output<List<SigningJobSignedObjectGetArgs>> signedObjects() {
        return this.signedObjects == null ? Codegen.empty() : this.signedObjects;
    }

    /**
     * The S3 bucket that contains the object to sign. See Source below for details.
     * 
     */
    @Import(name="source")
      private final @Nullable Output<SigningJobSourceGetArgs> source;

    public Output<SigningJobSourceGetArgs> source() {
        return this.source == null ? Codegen.empty() : this.source;
    }

    /**
     * Status of the signing job.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * String value that contains the status reason.
     * 
     */
    @Import(name="statusReason")
      private final @Nullable Output<String> statusReason;

    public Output<String> statusReason() {
        return this.statusReason == null ? Codegen.empty() : this.statusReason;
    }

    public SigningJobState(
        @Nullable Output<String> completedAt,
        @Nullable Output<String> createdAt,
        @Nullable Output<SigningJobDestinationGetArgs> destination,
        @Nullable Output<Boolean> ignoreSigningJobFailure,
        @Nullable Output<String> jobId,
        @Nullable Output<String> jobInvoker,
        @Nullable Output<String> jobOwner,
        @Nullable Output<String> platformDisplayName,
        @Nullable Output<String> platformId,
        @Nullable Output<String> profileName,
        @Nullable Output<String> profileVersion,
        @Nullable Output<String> requestedBy,
        @Nullable Output<List<SigningJobRevocationRecordGetArgs>> revocationRecords,
        @Nullable Output<String> signatureExpiresAt,
        @Nullable Output<List<SigningJobSignedObjectGetArgs>> signedObjects,
        @Nullable Output<SigningJobSourceGetArgs> source,
        @Nullable Output<String> status,
        @Nullable Output<String> statusReason) {
        this.completedAt = completedAt;
        this.createdAt = createdAt;
        this.destination = destination;
        this.ignoreSigningJobFailure = ignoreSigningJobFailure;
        this.jobId = jobId;
        this.jobInvoker = jobInvoker;
        this.jobOwner = jobOwner;
        this.platformDisplayName = platformDisplayName;
        this.platformId = platformId;
        this.profileName = profileName;
        this.profileVersion = profileVersion;
        this.requestedBy = requestedBy;
        this.revocationRecords = revocationRecords;
        this.signatureExpiresAt = signatureExpiresAt;
        this.signedObjects = signedObjects;
        this.source = source;
        this.status = status;
        this.statusReason = statusReason;
    }

    private SigningJobState() {
        this.completedAt = Codegen.empty();
        this.createdAt = Codegen.empty();
        this.destination = Codegen.empty();
        this.ignoreSigningJobFailure = Codegen.empty();
        this.jobId = Codegen.empty();
        this.jobInvoker = Codegen.empty();
        this.jobOwner = Codegen.empty();
        this.platformDisplayName = Codegen.empty();
        this.platformId = Codegen.empty();
        this.profileName = Codegen.empty();
        this.profileVersion = Codegen.empty();
        this.requestedBy = Codegen.empty();
        this.revocationRecords = Codegen.empty();
        this.signatureExpiresAt = Codegen.empty();
        this.signedObjects = Codegen.empty();
        this.source = Codegen.empty();
        this.status = Codegen.empty();
        this.statusReason = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> completedAt;
        private @Nullable Output<String> createdAt;
        private @Nullable Output<SigningJobDestinationGetArgs> destination;
        private @Nullable Output<Boolean> ignoreSigningJobFailure;
        private @Nullable Output<String> jobId;
        private @Nullable Output<String> jobInvoker;
        private @Nullable Output<String> jobOwner;
        private @Nullable Output<String> platformDisplayName;
        private @Nullable Output<String> platformId;
        private @Nullable Output<String> profileName;
        private @Nullable Output<String> profileVersion;
        private @Nullable Output<String> requestedBy;
        private @Nullable Output<List<SigningJobRevocationRecordGetArgs>> revocationRecords;
        private @Nullable Output<String> signatureExpiresAt;
        private @Nullable Output<List<SigningJobSignedObjectGetArgs>> signedObjects;
        private @Nullable Output<SigningJobSourceGetArgs> source;
        private @Nullable Output<String> status;
        private @Nullable Output<String> statusReason;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningJobState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completedAt = defaults.completedAt;
    	      this.createdAt = defaults.createdAt;
    	      this.destination = defaults.destination;
    	      this.ignoreSigningJobFailure = defaults.ignoreSigningJobFailure;
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
    	      this.source = defaults.source;
    	      this.status = defaults.status;
    	      this.statusReason = defaults.statusReason;
        }

        public Builder completedAt(@Nullable Output<String> completedAt) {
            this.completedAt = completedAt;
            return this;
        }
        public Builder completedAt(@Nullable String completedAt) {
            this.completedAt = Codegen.ofNullable(completedAt);
            return this;
        }
        public Builder createdAt(@Nullable Output<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = Codegen.ofNullable(createdAt);
            return this;
        }
        public Builder destination(@Nullable Output<SigningJobDestinationGetArgs> destination) {
            this.destination = destination;
            return this;
        }
        public Builder destination(@Nullable SigningJobDestinationGetArgs destination) {
            this.destination = Codegen.ofNullable(destination);
            return this;
        }
        public Builder ignoreSigningJobFailure(@Nullable Output<Boolean> ignoreSigningJobFailure) {
            this.ignoreSigningJobFailure = ignoreSigningJobFailure;
            return this;
        }
        public Builder ignoreSigningJobFailure(@Nullable Boolean ignoreSigningJobFailure) {
            this.ignoreSigningJobFailure = Codegen.ofNullable(ignoreSigningJobFailure);
            return this;
        }
        public Builder jobId(@Nullable Output<String> jobId) {
            this.jobId = jobId;
            return this;
        }
        public Builder jobId(@Nullable String jobId) {
            this.jobId = Codegen.ofNullable(jobId);
            return this;
        }
        public Builder jobInvoker(@Nullable Output<String> jobInvoker) {
            this.jobInvoker = jobInvoker;
            return this;
        }
        public Builder jobInvoker(@Nullable String jobInvoker) {
            this.jobInvoker = Codegen.ofNullable(jobInvoker);
            return this;
        }
        public Builder jobOwner(@Nullable Output<String> jobOwner) {
            this.jobOwner = jobOwner;
            return this;
        }
        public Builder jobOwner(@Nullable String jobOwner) {
            this.jobOwner = Codegen.ofNullable(jobOwner);
            return this;
        }
        public Builder platformDisplayName(@Nullable Output<String> platformDisplayName) {
            this.platformDisplayName = platformDisplayName;
            return this;
        }
        public Builder platformDisplayName(@Nullable String platformDisplayName) {
            this.platformDisplayName = Codegen.ofNullable(platformDisplayName);
            return this;
        }
        public Builder platformId(@Nullable Output<String> platformId) {
            this.platformId = platformId;
            return this;
        }
        public Builder platformId(@Nullable String platformId) {
            this.platformId = Codegen.ofNullable(platformId);
            return this;
        }
        public Builder profileName(@Nullable Output<String> profileName) {
            this.profileName = profileName;
            return this;
        }
        public Builder profileName(@Nullable String profileName) {
            this.profileName = Codegen.ofNullable(profileName);
            return this;
        }
        public Builder profileVersion(@Nullable Output<String> profileVersion) {
            this.profileVersion = profileVersion;
            return this;
        }
        public Builder profileVersion(@Nullable String profileVersion) {
            this.profileVersion = Codegen.ofNullable(profileVersion);
            return this;
        }
        public Builder requestedBy(@Nullable Output<String> requestedBy) {
            this.requestedBy = requestedBy;
            return this;
        }
        public Builder requestedBy(@Nullable String requestedBy) {
            this.requestedBy = Codegen.ofNullable(requestedBy);
            return this;
        }
        public Builder revocationRecords(@Nullable Output<List<SigningJobRevocationRecordGetArgs>> revocationRecords) {
            this.revocationRecords = revocationRecords;
            return this;
        }
        public Builder revocationRecords(@Nullable List<SigningJobRevocationRecordGetArgs> revocationRecords) {
            this.revocationRecords = Codegen.ofNullable(revocationRecords);
            return this;
        }
        public Builder revocationRecords(SigningJobRevocationRecordGetArgs... revocationRecords) {
            return revocationRecords(List.of(revocationRecords));
        }
        public Builder signatureExpiresAt(@Nullable Output<String> signatureExpiresAt) {
            this.signatureExpiresAt = signatureExpiresAt;
            return this;
        }
        public Builder signatureExpiresAt(@Nullable String signatureExpiresAt) {
            this.signatureExpiresAt = Codegen.ofNullable(signatureExpiresAt);
            return this;
        }
        public Builder signedObjects(@Nullable Output<List<SigningJobSignedObjectGetArgs>> signedObjects) {
            this.signedObjects = signedObjects;
            return this;
        }
        public Builder signedObjects(@Nullable List<SigningJobSignedObjectGetArgs> signedObjects) {
            this.signedObjects = Codegen.ofNullable(signedObjects);
            return this;
        }
        public Builder signedObjects(SigningJobSignedObjectGetArgs... signedObjects) {
            return signedObjects(List.of(signedObjects));
        }
        public Builder source(@Nullable Output<SigningJobSourceGetArgs> source) {
            this.source = source;
            return this;
        }
        public Builder source(@Nullable SigningJobSourceGetArgs source) {
            this.source = Codegen.ofNullable(source);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder statusReason(@Nullable Output<String> statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public Builder statusReason(@Nullable String statusReason) {
            this.statusReason = Codegen.ofNullable(statusReason);
            return this;
        }        public SigningJobState build() {
            return new SigningJobState(completedAt, createdAt, destination, ignoreSigningJobFailure, jobId, jobInvoker, jobOwner, platformDisplayName, platformId, profileName, profileVersion, requestedBy, revocationRecords, signatureExpiresAt, signedObjects, source, status, statusReason);
        }
    }
}
