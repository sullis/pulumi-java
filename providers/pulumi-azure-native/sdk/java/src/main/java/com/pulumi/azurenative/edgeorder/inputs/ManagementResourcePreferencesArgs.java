// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Management resource preference to link device
 * 
 */
public final class ManagementResourcePreferencesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagementResourcePreferencesArgs Empty = new ManagementResourcePreferencesArgs();

    /**
     * Customer preferred Management resource ARM ID
     * 
     */
    @Import(name="preferredManagementResourceId")
    private @Nullable Output<String> preferredManagementResourceId;

    /**
     * @return Customer preferred Management resource ARM ID
     * 
     */
    public Optional<Output<String>> preferredManagementResourceId() {
        return Optional.ofNullable(this.preferredManagementResourceId);
    }

    private ManagementResourcePreferencesArgs() {}

    private ManagementResourcePreferencesArgs(ManagementResourcePreferencesArgs $) {
        this.preferredManagementResourceId = $.preferredManagementResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementResourcePreferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementResourcePreferencesArgs $;

        public Builder() {
            $ = new ManagementResourcePreferencesArgs();
        }

        public Builder(ManagementResourcePreferencesArgs defaults) {
            $ = new ManagementResourcePreferencesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param preferredManagementResourceId Customer preferred Management resource ARM ID
         * 
         * @return builder
         * 
         */
        public Builder preferredManagementResourceId(@Nullable Output<String> preferredManagementResourceId) {
            $.preferredManagementResourceId = preferredManagementResourceId;
            return this;
        }

        /**
         * @param preferredManagementResourceId Customer preferred Management resource ARM ID
         * 
         * @return builder
         * 
         */
        public Builder preferredManagementResourceId(String preferredManagementResourceId) {
            return preferredManagementResourceId(Output.of(preferredManagementResourceId));
        }

        public ManagementResourcePreferencesArgs build() {
            return $;
        }
    }

}
