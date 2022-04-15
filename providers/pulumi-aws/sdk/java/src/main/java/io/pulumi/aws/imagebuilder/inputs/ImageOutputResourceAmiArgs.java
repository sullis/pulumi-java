// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageOutputResourceAmiArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageOutputResourceAmiArgs Empty = new ImageOutputResourceAmiArgs();

    /**
     * Account identifier of the AMI.
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId == null ? Codegen.empty() : this.accountId;
    }

    /**
     * Description of the AMI.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Identifier of the AMI.
     * 
     */
    @Import(name="image")
      private final @Nullable Output<String> image;

    public Output<String> image() {
        return this.image == null ? Codegen.empty() : this.image;
    }

    /**
     * Name of the AMI.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Region of the AMI.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    public ImageOutputResourceAmiArgs(
        @Nullable Output<String> accountId,
        @Nullable Output<String> description,
        @Nullable Output<String> image,
        @Nullable Output<String> name,
        @Nullable Output<String> region) {
        this.accountId = accountId;
        this.description = description;
        this.image = image;
        this.name = name;
        this.region = region;
    }

    private ImageOutputResourceAmiArgs() {
        this.accountId = Codegen.empty();
        this.description = Codegen.empty();
        this.image = Codegen.empty();
        this.name = Codegen.empty();
        this.region = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageOutputResourceAmiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<String> description;
        private @Nullable Output<String> image;
        private @Nullable Output<String> name;
        private @Nullable Output<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageOutputResourceAmiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.description = defaults.description;
    	      this.image = defaults.image;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Codegen.ofNullable(accountId);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder image(@Nullable Output<String> image) {
            this.image = image;
            return this;
        }
        public Builder image(@Nullable String image) {
            this.image = Codegen.ofNullable(image);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }        public ImageOutputResourceAmiArgs build() {
            return new ImageOutputResourceAmiArgs(accountId, description, image, name, region);
        }
    }
}
