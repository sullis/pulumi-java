// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigCorsArgs;
import com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigIpRestrictionArgs;
import com.pulumi.azure.appservice.inputs.FunctionAppSlotSiteConfigScmIpRestrictionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionAppSlotSiteConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionAppSlotSiteConfigArgs Empty = new FunctionAppSlotSiteConfigArgs();

    /**
     * Should the Function App be loaded at all times? Defaults to `false`.
     * 
     */
    @Import(name="alwaysOn")
    private @Nullable Output<Boolean> alwaysOn;

    /**
     * @return Should the Function App be loaded at all times? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> alwaysOn() {
        return Optional.ofNullable(this.alwaysOn);
    }

    /**
     * The number of workers this function app can scale out to. Only applicable to apps on the Consumption and Premium plan.
     * 
     */
    @Import(name="appScaleLimit")
    private @Nullable Output<Integer> appScaleLimit;

    /**
     * @return The number of workers this function app can scale out to. Only applicable to apps on the Consumption and Premium plan.
     * 
     */
    public Optional<Output<Integer>> appScaleLimit() {
        return Optional.ofNullable(this.appScaleLimit);
    }

    /**
     * The name of the slot to automatically swap to during deployment
     * 
     */
    @Import(name="autoSwapSlotName")
    private @Nullable Output<String> autoSwapSlotName;

    /**
     * @return The name of the slot to automatically swap to during deployment
     * 
     */
    public Optional<Output<String>> autoSwapSlotName() {
        return Optional.ofNullable(this.autoSwapSlotName);
    }

    /**
     * A `cors` block as defined below.
     * 
     */
    @Import(name="cors")
    private @Nullable Output<FunctionAppSlotSiteConfigCorsArgs> cors;

    /**
     * @return A `cors` block as defined below.
     * 
     */
    public Optional<Output<FunctionAppSlotSiteConfigCorsArgs>> cors() {
        return Optional.ofNullable(this.cors);
    }

    /**
     * The version of the .NET framework&#39;s CLR used in this function app. Possible values are `v4.0` (including .NET Core 2.1 and 3.1), `v5.0` and `v6.0`. [For more information on which .NET Framework version to use based on the runtime version you&#39;re targeting - please see this table](https://docs.microsoft.com/en-us/azure/azure-functions/functions-dotnet-class-library#supported-versions). Defaults to `v4.0`.
     * 
     */
    @Import(name="dotnetFrameworkVersion")
    private @Nullable Output<String> dotnetFrameworkVersion;

    /**
     * @return The version of the .NET framework&#39;s CLR used in this function app. Possible values are `v4.0` (including .NET Core 2.1 and 3.1), `v5.0` and `v6.0`. [For more information on which .NET Framework version to use based on the runtime version you&#39;re targeting - please see this table](https://docs.microsoft.com/en-us/azure/azure-functions/functions-dotnet-class-library#supported-versions). Defaults to `v4.0`.
     * 
     */
    public Optional<Output<String>> dotnetFrameworkVersion() {
        return Optional.ofNullable(this.dotnetFrameworkVersion);
    }

    /**
     * The number of minimum instances for this function app. Only applicable to apps on the Premium plan.
     * 
     */
    @Import(name="elasticInstanceMinimum")
    private @Nullable Output<Integer> elasticInstanceMinimum;

    /**
     * @return The number of minimum instances for this function app. Only applicable to apps on the Premium plan.
     * 
     */
    public Optional<Output<Integer>> elasticInstanceMinimum() {
        return Optional.ofNullable(this.elasticInstanceMinimum);
    }

    /**
     * State of FTP / FTPS service for this function app. Possible values include: `AllAllowed`, `FtpsOnly` and `Disabled`.
     * 
     */
    @Import(name="ftpsState")
    private @Nullable Output<String> ftpsState;

    /**
     * @return State of FTP / FTPS service for this function app. Possible values include: `AllAllowed`, `FtpsOnly` and `Disabled`.
     * 
     */
    public Optional<Output<String>> ftpsState() {
        return Optional.ofNullable(this.ftpsState);
    }

    @Import(name="healthCheckPath")
    private @Nullable Output<String> healthCheckPath;

    public Optional<Output<String>> healthCheckPath() {
        return Optional.ofNullable(this.healthCheckPath);
    }

    /**
     * Specifies whether or not the HTTP2 protocol should be enabled. Defaults to `false`.
     * 
     */
    @Import(name="http2Enabled")
    private @Nullable Output<Boolean> http2Enabled;

    /**
     * @return Specifies whether or not the HTTP2 protocol should be enabled. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> http2Enabled() {
        return Optional.ofNullable(this.http2Enabled);
    }

    /**
     * A [List of objects](https://www.terraform.io/docs/configuration/attr-as-blocks.html) representing IP restrictions as defined below.
     * 
     */
    @Import(name="ipRestrictions")
    private @Nullable Output<List<FunctionAppSlotSiteConfigIpRestrictionArgs>> ipRestrictions;

    /**
     * @return A [List of objects](https://www.terraform.io/docs/configuration/attr-as-blocks.html) representing IP restrictions as defined below.
     * 
     */
    public Optional<Output<List<FunctionAppSlotSiteConfigIpRestrictionArgs>>> ipRestrictions() {
        return Optional.ofNullable(this.ipRestrictions);
    }

    @Import(name="javaVersion")
    private @Nullable Output<String> javaVersion;

    public Optional<Output<String>> javaVersion() {
        return Optional.ofNullable(this.javaVersion);
    }

    /**
     * Linux App Framework and version for the AppService, e.g. `DOCKER|(golang:latest)`.
     * 
     */
    @Import(name="linuxFxVersion")
    private @Nullable Output<String> linuxFxVersion;

    /**
     * @return Linux App Framework and version for the AppService, e.g. `DOCKER|(golang:latest)`.
     * 
     */
    public Optional<Output<String>> linuxFxVersion() {
        return Optional.ofNullable(this.linuxFxVersion);
    }

    /**
     * The minimum supported TLS version for the function app. Possible values are `1.0`, `1.1`, and `1.2`. Defaults to `1.2` for new function apps.
     * 
     */
    @Import(name="minTlsVersion")
    private @Nullable Output<String> minTlsVersion;

    /**
     * @return The minimum supported TLS version for the function app. Possible values are `1.0`, `1.1`, and `1.2`. Defaults to `1.2` for new function apps.
     * 
     */
    public Optional<Output<String>> minTlsVersion() {
        return Optional.ofNullable(this.minTlsVersion);
    }

    /**
     * The number of pre-warmed instances for this function app. Only affects apps on the Premium plan.
     * 
     */
    @Import(name="preWarmedInstanceCount")
    private @Nullable Output<Integer> preWarmedInstanceCount;

    /**
     * @return The number of pre-warmed instances for this function app. Only affects apps on the Premium plan.
     * 
     */
    public Optional<Output<Integer>> preWarmedInstanceCount() {
        return Optional.ofNullable(this.preWarmedInstanceCount);
    }

    /**
     * Should Runtime Scale Monitoring be enabled?. Only applicable to apps on the Premium plan. Defaults to `false`.
     * 
     */
    @Import(name="runtimeScaleMonitoringEnabled")
    private @Nullable Output<Boolean> runtimeScaleMonitoringEnabled;

    /**
     * @return Should Runtime Scale Monitoring be enabled?. Only applicable to apps on the Premium plan. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> runtimeScaleMonitoringEnabled() {
        return Optional.ofNullable(this.runtimeScaleMonitoringEnabled);
    }

    @Import(name="scmIpRestrictions")
    private @Nullable Output<List<FunctionAppSlotSiteConfigScmIpRestrictionArgs>> scmIpRestrictions;

    public Optional<Output<List<FunctionAppSlotSiteConfigScmIpRestrictionArgs>>> scmIpRestrictions() {
        return Optional.ofNullable(this.scmIpRestrictions);
    }

    @Import(name="scmType")
    private @Nullable Output<String> scmType;

    public Optional<Output<String>> scmType() {
        return Optional.ofNullable(this.scmType);
    }

    @Import(name="scmUseMainIpRestriction")
    private @Nullable Output<Boolean> scmUseMainIpRestriction;

    public Optional<Output<Boolean>> scmUseMainIpRestriction() {
        return Optional.ofNullable(this.scmUseMainIpRestriction);
    }

    /**
     * Should the Function App run in 32 bit mode, rather than 64 bit mode? Defaults to `true`.
     * 
     */
    @Import(name="use32BitWorkerProcess")
    private @Nullable Output<Boolean> use32BitWorkerProcess;

    /**
     * @return Should the Function App run in 32 bit mode, rather than 64 bit mode? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> use32BitWorkerProcess() {
        return Optional.ofNullable(this.use32BitWorkerProcess);
    }

    @Import(name="vnetRouteAllEnabled")
    private @Nullable Output<Boolean> vnetRouteAllEnabled;

    public Optional<Output<Boolean>> vnetRouteAllEnabled() {
        return Optional.ofNullable(this.vnetRouteAllEnabled);
    }

    /**
     * Should WebSockets be enabled?
     * 
     */
    @Import(name="websocketsEnabled")
    private @Nullable Output<Boolean> websocketsEnabled;

    /**
     * @return Should WebSockets be enabled?
     * 
     */
    public Optional<Output<Boolean>> websocketsEnabled() {
        return Optional.ofNullable(this.websocketsEnabled);
    }

    private FunctionAppSlotSiteConfigArgs() {}

    private FunctionAppSlotSiteConfigArgs(FunctionAppSlotSiteConfigArgs $) {
        this.alwaysOn = $.alwaysOn;
        this.appScaleLimit = $.appScaleLimit;
        this.autoSwapSlotName = $.autoSwapSlotName;
        this.cors = $.cors;
        this.dotnetFrameworkVersion = $.dotnetFrameworkVersion;
        this.elasticInstanceMinimum = $.elasticInstanceMinimum;
        this.ftpsState = $.ftpsState;
        this.healthCheckPath = $.healthCheckPath;
        this.http2Enabled = $.http2Enabled;
        this.ipRestrictions = $.ipRestrictions;
        this.javaVersion = $.javaVersion;
        this.linuxFxVersion = $.linuxFxVersion;
        this.minTlsVersion = $.minTlsVersion;
        this.preWarmedInstanceCount = $.preWarmedInstanceCount;
        this.runtimeScaleMonitoringEnabled = $.runtimeScaleMonitoringEnabled;
        this.scmIpRestrictions = $.scmIpRestrictions;
        this.scmType = $.scmType;
        this.scmUseMainIpRestriction = $.scmUseMainIpRestriction;
        this.use32BitWorkerProcess = $.use32BitWorkerProcess;
        this.vnetRouteAllEnabled = $.vnetRouteAllEnabled;
        this.websocketsEnabled = $.websocketsEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionAppSlotSiteConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionAppSlotSiteConfigArgs $;

        public Builder() {
            $ = new FunctionAppSlotSiteConfigArgs();
        }

        public Builder(FunctionAppSlotSiteConfigArgs defaults) {
            $ = new FunctionAppSlotSiteConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alwaysOn Should the Function App be loaded at all times? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder alwaysOn(@Nullable Output<Boolean> alwaysOn) {
            $.alwaysOn = alwaysOn;
            return this;
        }

        /**
         * @param alwaysOn Should the Function App be loaded at all times? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder alwaysOn(Boolean alwaysOn) {
            return alwaysOn(Output.of(alwaysOn));
        }

        /**
         * @param appScaleLimit The number of workers this function app can scale out to. Only applicable to apps on the Consumption and Premium plan.
         * 
         * @return builder
         * 
         */
        public Builder appScaleLimit(@Nullable Output<Integer> appScaleLimit) {
            $.appScaleLimit = appScaleLimit;
            return this;
        }

        /**
         * @param appScaleLimit The number of workers this function app can scale out to. Only applicable to apps on the Consumption and Premium plan.
         * 
         * @return builder
         * 
         */
        public Builder appScaleLimit(Integer appScaleLimit) {
            return appScaleLimit(Output.of(appScaleLimit));
        }

        /**
         * @param autoSwapSlotName The name of the slot to automatically swap to during deployment
         * 
         * @return builder
         * 
         */
        public Builder autoSwapSlotName(@Nullable Output<String> autoSwapSlotName) {
            $.autoSwapSlotName = autoSwapSlotName;
            return this;
        }

        /**
         * @param autoSwapSlotName The name of the slot to automatically swap to during deployment
         * 
         * @return builder
         * 
         */
        public Builder autoSwapSlotName(String autoSwapSlotName) {
            return autoSwapSlotName(Output.of(autoSwapSlotName));
        }

        /**
         * @param cors A `cors` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder cors(@Nullable Output<FunctionAppSlotSiteConfigCorsArgs> cors) {
            $.cors = cors;
            return this;
        }

        /**
         * @param cors A `cors` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder cors(FunctionAppSlotSiteConfigCorsArgs cors) {
            return cors(Output.of(cors));
        }

        /**
         * @param dotnetFrameworkVersion The version of the .NET framework&#39;s CLR used in this function app. Possible values are `v4.0` (including .NET Core 2.1 and 3.1), `v5.0` and `v6.0`. [For more information on which .NET Framework version to use based on the runtime version you&#39;re targeting - please see this table](https://docs.microsoft.com/en-us/azure/azure-functions/functions-dotnet-class-library#supported-versions). Defaults to `v4.0`.
         * 
         * @return builder
         * 
         */
        public Builder dotnetFrameworkVersion(@Nullable Output<String> dotnetFrameworkVersion) {
            $.dotnetFrameworkVersion = dotnetFrameworkVersion;
            return this;
        }

        /**
         * @param dotnetFrameworkVersion The version of the .NET framework&#39;s CLR used in this function app. Possible values are `v4.0` (including .NET Core 2.1 and 3.1), `v5.0` and `v6.0`. [For more information on which .NET Framework version to use based on the runtime version you&#39;re targeting - please see this table](https://docs.microsoft.com/en-us/azure/azure-functions/functions-dotnet-class-library#supported-versions). Defaults to `v4.0`.
         * 
         * @return builder
         * 
         */
        public Builder dotnetFrameworkVersion(String dotnetFrameworkVersion) {
            return dotnetFrameworkVersion(Output.of(dotnetFrameworkVersion));
        }

        /**
         * @param elasticInstanceMinimum The number of minimum instances for this function app. Only applicable to apps on the Premium plan.
         * 
         * @return builder
         * 
         */
        public Builder elasticInstanceMinimum(@Nullable Output<Integer> elasticInstanceMinimum) {
            $.elasticInstanceMinimum = elasticInstanceMinimum;
            return this;
        }

        /**
         * @param elasticInstanceMinimum The number of minimum instances for this function app. Only applicable to apps on the Premium plan.
         * 
         * @return builder
         * 
         */
        public Builder elasticInstanceMinimum(Integer elasticInstanceMinimum) {
            return elasticInstanceMinimum(Output.of(elasticInstanceMinimum));
        }

        /**
         * @param ftpsState State of FTP / FTPS service for this function app. Possible values include: `AllAllowed`, `FtpsOnly` and `Disabled`.
         * 
         * @return builder
         * 
         */
        public Builder ftpsState(@Nullable Output<String> ftpsState) {
            $.ftpsState = ftpsState;
            return this;
        }

        /**
         * @param ftpsState State of FTP / FTPS service for this function app. Possible values include: `AllAllowed`, `FtpsOnly` and `Disabled`.
         * 
         * @return builder
         * 
         */
        public Builder ftpsState(String ftpsState) {
            return ftpsState(Output.of(ftpsState));
        }

        public Builder healthCheckPath(@Nullable Output<String> healthCheckPath) {
            $.healthCheckPath = healthCheckPath;
            return this;
        }

        public Builder healthCheckPath(String healthCheckPath) {
            return healthCheckPath(Output.of(healthCheckPath));
        }

        /**
         * @param http2Enabled Specifies whether or not the HTTP2 protocol should be enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder http2Enabled(@Nullable Output<Boolean> http2Enabled) {
            $.http2Enabled = http2Enabled;
            return this;
        }

        /**
         * @param http2Enabled Specifies whether or not the HTTP2 protocol should be enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder http2Enabled(Boolean http2Enabled) {
            return http2Enabled(Output.of(http2Enabled));
        }

        /**
         * @param ipRestrictions A [List of objects](https://www.terraform.io/docs/configuration/attr-as-blocks.html) representing IP restrictions as defined below.
         * 
         * @return builder
         * 
         */
        public Builder ipRestrictions(@Nullable Output<List<FunctionAppSlotSiteConfigIpRestrictionArgs>> ipRestrictions) {
            $.ipRestrictions = ipRestrictions;
            return this;
        }

        /**
         * @param ipRestrictions A [List of objects](https://www.terraform.io/docs/configuration/attr-as-blocks.html) representing IP restrictions as defined below.
         * 
         * @return builder
         * 
         */
        public Builder ipRestrictions(List<FunctionAppSlotSiteConfigIpRestrictionArgs> ipRestrictions) {
            return ipRestrictions(Output.of(ipRestrictions));
        }

        /**
         * @param ipRestrictions A [List of objects](https://www.terraform.io/docs/configuration/attr-as-blocks.html) representing IP restrictions as defined below.
         * 
         * @return builder
         * 
         */
        public Builder ipRestrictions(FunctionAppSlotSiteConfigIpRestrictionArgs... ipRestrictions) {
            return ipRestrictions(List.of(ipRestrictions));
        }

        public Builder javaVersion(@Nullable Output<String> javaVersion) {
            $.javaVersion = javaVersion;
            return this;
        }

        public Builder javaVersion(String javaVersion) {
            return javaVersion(Output.of(javaVersion));
        }

        /**
         * @param linuxFxVersion Linux App Framework and version for the AppService, e.g. `DOCKER|(golang:latest)`.
         * 
         * @return builder
         * 
         */
        public Builder linuxFxVersion(@Nullable Output<String> linuxFxVersion) {
            $.linuxFxVersion = linuxFxVersion;
            return this;
        }

        /**
         * @param linuxFxVersion Linux App Framework and version for the AppService, e.g. `DOCKER|(golang:latest)`.
         * 
         * @return builder
         * 
         */
        public Builder linuxFxVersion(String linuxFxVersion) {
            return linuxFxVersion(Output.of(linuxFxVersion));
        }

        /**
         * @param minTlsVersion The minimum supported TLS version for the function app. Possible values are `1.0`, `1.1`, and `1.2`. Defaults to `1.2` for new function apps.
         * 
         * @return builder
         * 
         */
        public Builder minTlsVersion(@Nullable Output<String> minTlsVersion) {
            $.minTlsVersion = minTlsVersion;
            return this;
        }

        /**
         * @param minTlsVersion The minimum supported TLS version for the function app. Possible values are `1.0`, `1.1`, and `1.2`. Defaults to `1.2` for new function apps.
         * 
         * @return builder
         * 
         */
        public Builder minTlsVersion(String minTlsVersion) {
            return minTlsVersion(Output.of(minTlsVersion));
        }

        /**
         * @param preWarmedInstanceCount The number of pre-warmed instances for this function app. Only affects apps on the Premium plan.
         * 
         * @return builder
         * 
         */
        public Builder preWarmedInstanceCount(@Nullable Output<Integer> preWarmedInstanceCount) {
            $.preWarmedInstanceCount = preWarmedInstanceCount;
            return this;
        }

        /**
         * @param preWarmedInstanceCount The number of pre-warmed instances for this function app. Only affects apps on the Premium plan.
         * 
         * @return builder
         * 
         */
        public Builder preWarmedInstanceCount(Integer preWarmedInstanceCount) {
            return preWarmedInstanceCount(Output.of(preWarmedInstanceCount));
        }

        /**
         * @param runtimeScaleMonitoringEnabled Should Runtime Scale Monitoring be enabled?. Only applicable to apps on the Premium plan. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder runtimeScaleMonitoringEnabled(@Nullable Output<Boolean> runtimeScaleMonitoringEnabled) {
            $.runtimeScaleMonitoringEnabled = runtimeScaleMonitoringEnabled;
            return this;
        }

        /**
         * @param runtimeScaleMonitoringEnabled Should Runtime Scale Monitoring be enabled?. Only applicable to apps on the Premium plan. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder runtimeScaleMonitoringEnabled(Boolean runtimeScaleMonitoringEnabled) {
            return runtimeScaleMonitoringEnabled(Output.of(runtimeScaleMonitoringEnabled));
        }

        public Builder scmIpRestrictions(@Nullable Output<List<FunctionAppSlotSiteConfigScmIpRestrictionArgs>> scmIpRestrictions) {
            $.scmIpRestrictions = scmIpRestrictions;
            return this;
        }

        public Builder scmIpRestrictions(List<FunctionAppSlotSiteConfigScmIpRestrictionArgs> scmIpRestrictions) {
            return scmIpRestrictions(Output.of(scmIpRestrictions));
        }

        public Builder scmIpRestrictions(FunctionAppSlotSiteConfigScmIpRestrictionArgs... scmIpRestrictions) {
            return scmIpRestrictions(List.of(scmIpRestrictions));
        }

        public Builder scmType(@Nullable Output<String> scmType) {
            $.scmType = scmType;
            return this;
        }

        public Builder scmType(String scmType) {
            return scmType(Output.of(scmType));
        }

        public Builder scmUseMainIpRestriction(@Nullable Output<Boolean> scmUseMainIpRestriction) {
            $.scmUseMainIpRestriction = scmUseMainIpRestriction;
            return this;
        }

        public Builder scmUseMainIpRestriction(Boolean scmUseMainIpRestriction) {
            return scmUseMainIpRestriction(Output.of(scmUseMainIpRestriction));
        }

        /**
         * @param use32BitWorkerProcess Should the Function App run in 32 bit mode, rather than 64 bit mode? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder use32BitWorkerProcess(@Nullable Output<Boolean> use32BitWorkerProcess) {
            $.use32BitWorkerProcess = use32BitWorkerProcess;
            return this;
        }

        /**
         * @param use32BitWorkerProcess Should the Function App run in 32 bit mode, rather than 64 bit mode? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder use32BitWorkerProcess(Boolean use32BitWorkerProcess) {
            return use32BitWorkerProcess(Output.of(use32BitWorkerProcess));
        }

        public Builder vnetRouteAllEnabled(@Nullable Output<Boolean> vnetRouteAllEnabled) {
            $.vnetRouteAllEnabled = vnetRouteAllEnabled;
            return this;
        }

        public Builder vnetRouteAllEnabled(Boolean vnetRouteAllEnabled) {
            return vnetRouteAllEnabled(Output.of(vnetRouteAllEnabled));
        }

        /**
         * @param websocketsEnabled Should WebSockets be enabled?
         * 
         * @return builder
         * 
         */
        public Builder websocketsEnabled(@Nullable Output<Boolean> websocketsEnabled) {
            $.websocketsEnabled = websocketsEnabled;
            return this;
        }

        /**
         * @param websocketsEnabled Should WebSockets be enabled?
         * 
         * @return builder
         * 
         */
        public Builder websocketsEnabled(Boolean websocketsEnabled) {
            return websocketsEnabled(Output.of(websocketsEnabled));
        }

        public FunctionAppSlotSiteConfigArgs build() {
            return $;
        }
    }

}
