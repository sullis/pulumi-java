// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DockerImagePlatformResponse extends com.pulumi.resources.InvokeArgs {

    public static final DockerImagePlatformResponse Empty = new DockerImagePlatformResponse();

    /**
     * The OS type the Environment.
     * 
     */
    @Import(name="operatingSystemType")
    private @Nullable String operatingSystemType;

    /**
     * @return The OS type the Environment.
     * 
     */
    public Optional<String> operatingSystemType() {
        return Optional.ofNullable(this.operatingSystemType);
    }

    private DockerImagePlatformResponse() {}

    private DockerImagePlatformResponse(DockerImagePlatformResponse $) {
        this.operatingSystemType = $.operatingSystemType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DockerImagePlatformResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DockerImagePlatformResponse $;

        public Builder() {
            $ = new DockerImagePlatformResponse();
        }

        public Builder(DockerImagePlatformResponse defaults) {
            $ = new DockerImagePlatformResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param operatingSystemType The OS type the Environment.
         * 
         * @return builder
         * 
         */
        public Builder operatingSystemType(@Nullable String operatingSystemType) {
            $.operatingSystemType = operatingSystemType;
            return this;
        }

        public DockerImagePlatformResponse build() {
            return $;
        }
    }

}
