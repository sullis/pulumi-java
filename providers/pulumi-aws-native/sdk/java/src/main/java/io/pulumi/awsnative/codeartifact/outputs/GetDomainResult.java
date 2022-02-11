// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codeartifact.outputs;

import io.pulumi.awsnative.codeartifact.outputs.DomainTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDomainResult {
    private final @Nullable String arn;
    private final @Nullable String name;
    private final @Nullable String owner;
    private final @Nullable Object permissionsPolicyDocument;
    private final @Nullable List<DomainTag> tags;

    @OutputCustomType.Constructor({"arn","name","owner","permissionsPolicyDocument","tags"})
    private GetDomainResult(
        @Nullable String arn,
        @Nullable String name,
        @Nullable String owner,
        @Nullable Object permissionsPolicyDocument,
        @Nullable List<DomainTag> tags) {
        this.arn = arn;
        this.name = name;
        this.owner = owner;
        this.permissionsPolicyDocument = permissionsPolicyDocument;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getOwner() {
        return Optional.ofNullable(this.owner);
    }
    public Optional<Object> getPermissionsPolicyDocument() {
        return Optional.ofNullable(this.permissionsPolicyDocument);
    }
    public List<DomainTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String name;
        private @Nullable String owner;
        private @Nullable Object permissionsPolicyDocument;
        private @Nullable List<DomainTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.permissionsPolicyDocument = defaults.permissionsPolicyDocument;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setOwner(@Nullable String owner) {
            this.owner = owner;
            return this;
        }

        public Builder setPermissionsPolicyDocument(@Nullable Object permissionsPolicyDocument) {
            this.permissionsPolicyDocument = permissionsPolicyDocument;
            return this;
        }

        public Builder setTags(@Nullable List<DomainTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetDomainResult build() {
            return new GetDomainResult(arn, name, owner, permissionsPolicyDocument, tags);
        }
    }
}
