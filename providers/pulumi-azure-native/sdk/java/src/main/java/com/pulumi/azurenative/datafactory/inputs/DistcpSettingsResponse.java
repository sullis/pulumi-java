// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Distcp settings.
 * 
 */
public final class DistcpSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final DistcpSettingsResponse Empty = new DistcpSettingsResponse();

    /**
     * Specifies the Distcp options. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="distcpOptions")
    private @Nullable Object distcpOptions;

    /**
     * @return Specifies the Distcp options. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> distcpOptions() {
        return Optional.ofNullable(this.distcpOptions);
    }

    /**
     * Specifies the Yarn ResourceManager endpoint. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="resourceManagerEndpoint", required=true)
    private Object resourceManagerEndpoint;

    /**
     * @return Specifies the Yarn ResourceManager endpoint. Type: string (or Expression with resultType string).
     * 
     */
    public Object resourceManagerEndpoint() {
        return this.resourceManagerEndpoint;
    }

    /**
     * Specifies an existing folder path which will be used to store temp Distcp command script. The script file is generated by ADF and will be removed after Copy job finished. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tempScriptPath", required=true)
    private Object tempScriptPath;

    /**
     * @return Specifies an existing folder path which will be used to store temp Distcp command script. The script file is generated by ADF and will be removed after Copy job finished. Type: string (or Expression with resultType string).
     * 
     */
    public Object tempScriptPath() {
        return this.tempScriptPath;
    }

    private DistcpSettingsResponse() {}

    private DistcpSettingsResponse(DistcpSettingsResponse $) {
        this.distcpOptions = $.distcpOptions;
        this.resourceManagerEndpoint = $.resourceManagerEndpoint;
        this.tempScriptPath = $.tempScriptPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistcpSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistcpSettingsResponse $;

        public Builder() {
            $ = new DistcpSettingsResponse();
        }

        public Builder(DistcpSettingsResponse defaults) {
            $ = new DistcpSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param distcpOptions Specifies the Distcp options. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder distcpOptions(@Nullable Object distcpOptions) {
            $.distcpOptions = distcpOptions;
            return this;
        }

        /**
         * @param resourceManagerEndpoint Specifies the Yarn ResourceManager endpoint. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder resourceManagerEndpoint(Object resourceManagerEndpoint) {
            $.resourceManagerEndpoint = resourceManagerEndpoint;
            return this;
        }

        /**
         * @param tempScriptPath Specifies an existing folder path which will be used to store temp Distcp command script. The script file is generated by ADF and will be removed after Copy job finished. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder tempScriptPath(Object tempScriptPath) {
            $.tempScriptPath = tempScriptPath;
            return this;
        }

        public DistcpSettingsResponse build() {
            $.resourceManagerEndpoint = Objects.requireNonNull($.resourceManagerEndpoint, "expected parameter 'resourceManagerEndpoint' to be non-null");
            $.tempScriptPath = Objects.requireNonNull($.tempScriptPath, "expected parameter 'tempScriptPath' to be non-null");
            return $;
        }
    }

}
