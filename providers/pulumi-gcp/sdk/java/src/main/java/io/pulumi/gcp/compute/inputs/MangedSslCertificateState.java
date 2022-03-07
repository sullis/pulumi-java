// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.MangedSslCertificateManagedGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MangedSslCertificateState extends io.pulumi.resources.ResourceArgs {

    public static final MangedSslCertificateState Empty = new MangedSslCertificateState();

    /**
     * The unique identifier for the resource.
     * 
     */
    @InputImport(name="certificateId")
      private final @Nullable Input<Integer> certificateId;

    public Input<Integer> getCertificateId() {
        return this.certificateId == null ? Input.empty() : this.certificateId;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @InputImport(name="creationTimestamp")
      private final @Nullable Input<String> creationTimestamp;

    public Input<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Input.empty() : this.creationTimestamp;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Expire time of the certificate.
     * 
     */
    @InputImport(name="expireTime")
      private final @Nullable Input<String> expireTime;

    public Input<String> getExpireTime() {
        return this.expireTime == null ? Input.empty() : this.expireTime;
    }

    /**
     * Properties relevant to a managed certificate. These will be used if the certificate is managed (as indicated by a value
     * of 'MANAGED' in 'type').
     * 
     */
    @InputImport(name="managed")
      private final @Nullable Input<MangedSslCertificateManagedGetArgs> managed;

    public Input<MangedSslCertificateManagedGetArgs> getManaged() {
        return this.managed == null ? Input.empty() : this.managed;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression
     * '[a-z]([-a-z0-9]*[a-z0-9])?' which means the first character must be a lowercase letter, and all following characters
     * must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. These are in the same
     * namespace as the managed SSL certificates.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="selfLink")
      private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    /**
     * Domains associated with the certificate via Subject Alternative Name.
     * 
     */
    @InputImport(name="subjectAlternativeNames")
      private final @Nullable Input<List<String>> subjectAlternativeNames;

    public Input<List<String>> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames == null ? Input.empty() : this.subjectAlternativeNames;
    }

    /**
     * Enum field whose value is always 'MANAGED' - used to signal to the API which type this is. Default value: "MANAGED"
     * Possible values: ["MANAGED"]
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public MangedSslCertificateState(
        @Nullable Input<Integer> certificateId,
        @Nullable Input<String> creationTimestamp,
        @Nullable Input<String> description,
        @Nullable Input<String> expireTime,
        @Nullable Input<MangedSslCertificateManagedGetArgs> managed,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> selfLink,
        @Nullable Input<List<String>> subjectAlternativeNames,
        @Nullable Input<String> type) {
        this.certificateId = certificateId;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.expireTime = expireTime;
        this.managed = managed;
        this.name = name;
        this.project = project;
        this.selfLink = selfLink;
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.type = type;
    }

    private MangedSslCertificateState() {
        this.certificateId = Input.empty();
        this.creationTimestamp = Input.empty();
        this.description = Input.empty();
        this.expireTime = Input.empty();
        this.managed = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.selfLink = Input.empty();
        this.subjectAlternativeNames = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MangedSslCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> certificateId;
        private @Nullable Input<String> creationTimestamp;
        private @Nullable Input<String> description;
        private @Nullable Input<String> expireTime;
        private @Nullable Input<MangedSslCertificateManagedGetArgs> managed;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<List<String>> subjectAlternativeNames;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MangedSslCertificateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateId = defaults.certificateId;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.expireTime = defaults.expireTime;
    	      this.managed = defaults.managed;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.type = defaults.type;
        }

        public Builder setCertificateId(@Nullable Input<Integer> certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        public Builder setCertificateId(@Nullable Integer certificateId) {
            this.certificateId = Input.ofNullable(certificateId);
            return this;
        }

        public Builder setCreationTimestamp(@Nullable Input<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder setCreationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Input.ofNullable(creationTimestamp);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setExpireTime(@Nullable Input<String> expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        public Builder setExpireTime(@Nullable String expireTime) {
            this.expireTime = Input.ofNullable(expireTime);
            return this;
        }

        public Builder setManaged(@Nullable Input<MangedSslCertificateManagedGetArgs> managed) {
            this.managed = managed;
            return this;
        }

        public Builder setManaged(@Nullable MangedSslCertificateManagedGetArgs managed) {
            this.managed = Input.ofNullable(managed);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setSubjectAlternativeNames(@Nullable Input<List<String>> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        public Builder setSubjectAlternativeNames(@Nullable List<String> subjectAlternativeNames) {
            this.subjectAlternativeNames = Input.ofNullable(subjectAlternativeNames);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public MangedSslCertificateState build() {
            return new MangedSslCertificateState(certificateId, creationTimestamp, description, expireTime, managed, name, project, selfLink, subjectAlternativeNames, type);
        }
    }
}