// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.outputs;

import io.pulumi.awsnative.lookoutmetrics.outputs.AnomalyDetectorVpcConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AnomalyDetectorRDSSourceConfig {
    private final String dBInstanceIdentifier;
    private final String databaseHost;
    private final String databaseName;
    private final Integer databasePort;
    private final String roleArn;
    private final String secretManagerArn;
    private final String tableName;
    private final AnomalyDetectorVpcConfiguration vpcConfiguration;

    @CustomType.Constructor
    private AnomalyDetectorRDSSourceConfig(
        @CustomType.Parameter("dBInstanceIdentifier") String dBInstanceIdentifier,
        @CustomType.Parameter("databaseHost") String databaseHost,
        @CustomType.Parameter("databaseName") String databaseName,
        @CustomType.Parameter("databasePort") Integer databasePort,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("secretManagerArn") String secretManagerArn,
        @CustomType.Parameter("tableName") String tableName,
        @CustomType.Parameter("vpcConfiguration") AnomalyDetectorVpcConfiguration vpcConfiguration) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        this.databaseHost = databaseHost;
        this.databaseName = databaseName;
        this.databasePort = databasePort;
        this.roleArn = roleArn;
        this.secretManagerArn = secretManagerArn;
        this.tableName = tableName;
        this.vpcConfiguration = vpcConfiguration;
    }

    public String dBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }
    public String databaseHost() {
        return this.databaseHost;
    }
    public String databaseName() {
        return this.databaseName;
    }
    public Integer databasePort() {
        return this.databasePort;
    }
    public String roleArn() {
        return this.roleArn;
    }
    public String secretManagerArn() {
        return this.secretManagerArn;
    }
    public String tableName() {
        return this.tableName;
    }
    public AnomalyDetectorVpcConfiguration vpcConfiguration() {
        return this.vpcConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorRDSSourceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dBInstanceIdentifier;
        private String databaseHost;
        private String databaseName;
        private Integer databasePort;
        private String roleArn;
        private String secretManagerArn;
        private String tableName;
        private AnomalyDetectorVpcConfiguration vpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorRDSSourceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dBInstanceIdentifier = defaults.dBInstanceIdentifier;
    	      this.databaseHost = defaults.databaseHost;
    	      this.databaseName = defaults.databaseName;
    	      this.databasePort = defaults.databasePort;
    	      this.roleArn = defaults.roleArn;
    	      this.secretManagerArn = defaults.secretManagerArn;
    	      this.tableName = defaults.tableName;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        public Builder dBInstanceIdentifier(String dBInstanceIdentifier) {
            this.dBInstanceIdentifier = Objects.requireNonNull(dBInstanceIdentifier);
            return this;
        }
        public Builder databaseHost(String databaseHost) {
            this.databaseHost = Objects.requireNonNull(databaseHost);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder databasePort(Integer databasePort) {
            this.databasePort = Objects.requireNonNull(databasePort);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder secretManagerArn(String secretManagerArn) {
            this.secretManagerArn = Objects.requireNonNull(secretManagerArn);
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public Builder vpcConfiguration(AnomalyDetectorVpcConfiguration vpcConfiguration) {
            this.vpcConfiguration = Objects.requireNonNull(vpcConfiguration);
            return this;
        }        public AnomalyDetectorRDSSourceConfig build() {
            return new AnomalyDetectorRDSSourceConfig(dBInstanceIdentifier, databaseHost, databaseName, databasePort, roleArn, secretManagerArn, tableName, vpcConfiguration);
        }
    }
}
