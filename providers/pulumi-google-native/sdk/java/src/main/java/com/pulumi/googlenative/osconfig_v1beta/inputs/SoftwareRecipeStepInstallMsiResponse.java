// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Installs an MSI file.
 * 
 */
public final class SoftwareRecipeStepInstallMsiResponse extends com.pulumi.resources.InvokeArgs {

    public static final SoftwareRecipeStepInstallMsiResponse Empty = new SoftwareRecipeStepInstallMsiResponse();

    /**
     * Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    @Import(name="allowedExitCodes", required=true)
    private List<Integer> allowedExitCodes;

    /**
     * @return Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    public List<Integer> allowedExitCodes() {
        return this.allowedExitCodes;
    }

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @Import(name="artifactId", required=true)
    private String artifactId;

    /**
     * @return The id of the relevant artifact in the recipe.
     * 
     */
    public String artifactId() {
        return this.artifactId;
    }

    /**
     * The flags to use when installing the MSI defaults to [&#34;/i&#34;] (i.e. the install flag).
     * 
     */
    @Import(name="flags", required=true)
    private List<String> flags;

    /**
     * @return The flags to use when installing the MSI defaults to [&#34;/i&#34;] (i.e. the install flag).
     * 
     */
    public List<String> flags() {
        return this.flags;
    }

    private SoftwareRecipeStepInstallMsiResponse() {}

    private SoftwareRecipeStepInstallMsiResponse(SoftwareRecipeStepInstallMsiResponse $) {
        this.allowedExitCodes = $.allowedExitCodes;
        this.artifactId = $.artifactId;
        this.flags = $.flags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SoftwareRecipeStepInstallMsiResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SoftwareRecipeStepInstallMsiResponse $;

        public Builder() {
            $ = new SoftwareRecipeStepInstallMsiResponse();
        }

        public Builder(SoftwareRecipeStepInstallMsiResponse defaults) {
            $ = new SoftwareRecipeStepInstallMsiResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedExitCodes Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
         * 
         * @return builder
         * 
         */
        public Builder allowedExitCodes(List<Integer> allowedExitCodes) {
            $.allowedExitCodes = allowedExitCodes;
            return this;
        }

        /**
         * @param allowedExitCodes Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
         * 
         * @return builder
         * 
         */
        public Builder allowedExitCodes(Integer... allowedExitCodes) {
            return allowedExitCodes(List.of(allowedExitCodes));
        }

        /**
         * @param artifactId The id of the relevant artifact in the recipe.
         * 
         * @return builder
         * 
         */
        public Builder artifactId(String artifactId) {
            $.artifactId = artifactId;
            return this;
        }

        /**
         * @param flags The flags to use when installing the MSI defaults to [&#34;/i&#34;] (i.e. the install flag).
         * 
         * @return builder
         * 
         */
        public Builder flags(List<String> flags) {
            $.flags = flags;
            return this;
        }

        /**
         * @param flags The flags to use when installing the MSI defaults to [&#34;/i&#34;] (i.e. the install flag).
         * 
         * @return builder
         * 
         */
        public Builder flags(String... flags) {
            return flags(List.of(flags));
        }

        public SoftwareRecipeStepInstallMsiResponse build() {
            $.allowedExitCodes = Objects.requireNonNull($.allowedExitCodes, "expected parameter 'allowedExitCodes' to be non-null");
            $.artifactId = Objects.requireNonNull($.artifactId, "expected parameter 'artifactId' to be non-null");
            $.flags = Objects.requireNonNull($.flags, "expected parameter 'flags' to be non-null");
            return $;
        }
    }

}
