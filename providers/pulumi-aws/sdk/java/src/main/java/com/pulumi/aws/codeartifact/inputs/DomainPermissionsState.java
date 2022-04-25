// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codeartifact.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainPermissionsState extends com.pulumi.resources.ResourceArgs {

    public static final DomainPermissionsState Empty = new DomainPermissionsState();

    /**
     * The name of the domain on which to set the resource policy.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The name of the domain on which to set the resource policy.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * The account number of the AWS account that owns the domain.
     * 
     */
    @Import(name="domainOwner")
    private @Nullable Output<String> domainOwner;

    /**
     * @return The account number of the AWS account that owns the domain.
     * 
     */
    public Optional<Output<String>> domainOwner() {
        return Optional.ofNullable(this.domainOwner);
    }

    /**
     * A JSON policy string to be set as the access control resource policy on the provided domain.
     * 
     */
    @Import(name="policyDocument")
    private @Nullable Output<String> policyDocument;

    /**
     * @return A JSON policy string to be set as the access control resource policy on the provided domain.
     * 
     */
    public Optional<Output<String>> policyDocument() {
        return Optional.ofNullable(this.policyDocument);
    }

    /**
     * The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain&#39;s resource policy.
     * 
     */
    @Import(name="policyRevision")
    private @Nullable Output<String> policyRevision;

    /**
     * @return The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain&#39;s resource policy.
     * 
     */
    public Optional<Output<String>> policyRevision() {
        return Optional.ofNullable(this.policyRevision);
    }

    /**
     * The ARN of the resource associated with the resource policy.
     * 
     */
    @Import(name="resourceArn")
    private @Nullable Output<String> resourceArn;

    /**
     * @return The ARN of the resource associated with the resource policy.
     * 
     */
    public Optional<Output<String>> resourceArn() {
        return Optional.ofNullable(this.resourceArn);
    }

    private DomainPermissionsState() {}

    private DomainPermissionsState(DomainPermissionsState $) {
        this.domain = $.domain;
        this.domainOwner = $.domainOwner;
        this.policyDocument = $.policyDocument;
        this.policyRevision = $.policyRevision;
        this.resourceArn = $.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainPermissionsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainPermissionsState $;

        public Builder() {
            $ = new DomainPermissionsState();
        }

        public Builder(DomainPermissionsState defaults) {
            $ = new DomainPermissionsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The name of the domain on which to set the resource policy.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The name of the domain on which to set the resource policy.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param domainOwner The account number of the AWS account that owns the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainOwner(@Nullable Output<String> domainOwner) {
            $.domainOwner = domainOwner;
            return this;
        }

        /**
         * @param domainOwner The account number of the AWS account that owns the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainOwner(String domainOwner) {
            return domainOwner(Output.of(domainOwner));
        }

        /**
         * @param policyDocument A JSON policy string to be set as the access control resource policy on the provided domain.
         * 
         * @return builder
         * 
         */
        public Builder policyDocument(@Nullable Output<String> policyDocument) {
            $.policyDocument = policyDocument;
            return this;
        }

        /**
         * @param policyDocument A JSON policy string to be set as the access control resource policy on the provided domain.
         * 
         * @return builder
         * 
         */
        public Builder policyDocument(String policyDocument) {
            return policyDocument(Output.of(policyDocument));
        }

        /**
         * @param policyRevision The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain&#39;s resource policy.
         * 
         * @return builder
         * 
         */
        public Builder policyRevision(@Nullable Output<String> policyRevision) {
            $.policyRevision = policyRevision;
            return this;
        }

        /**
         * @param policyRevision The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain&#39;s resource policy.
         * 
         * @return builder
         * 
         */
        public Builder policyRevision(String policyRevision) {
            return policyRevision(Output.of(policyRevision));
        }

        /**
         * @param resourceArn The ARN of the resource associated with the resource policy.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(@Nullable Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        /**
         * @param resourceArn The ARN of the resource associated with the resource policy.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        public DomainPermissionsState build() {
            return $;
        }
    }

}
