// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.AttestationArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.BuildDetailsArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.ComplianceOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.DSSEAttestationOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.DeploymentArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.DerivedArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.DiscoveredArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.DocumentOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.EnvelopeArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.FileOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.InstallationArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.PackageInfoOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.RelationshipOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.ResourceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.UpgradeOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.VulnerabilityDetailsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OccurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final OccurrenceArgs Empty = new OccurrenceArgs();

    /**
     * Describes an attestation of an artifact.
     * 
     */
    @InputImport(name="attestation")
      private final @Nullable Input<AttestationArgs> attestation;

    public Input<AttestationArgs> getAttestation() {
        return this.attestation == null ? Input.empty() : this.attestation;
    }

    /**
     * Build details for a verifiable build.
     * 
     */
    @InputImport(name="buildDetails")
      private final @Nullable Input<BuildDetailsArgs> buildDetails;

    public Input<BuildDetailsArgs> getBuildDetails() {
        return this.buildDetails == null ? Input.empty() : this.buildDetails;
    }

    /**
     * Describes whether or not a resource passes compliance checks.
     * 
     */
    @InputImport(name="compliance")
      private final @Nullable Input<ComplianceOccurrenceArgs> compliance;

    public Input<ComplianceOccurrenceArgs> getCompliance() {
        return this.compliance == null ? Input.empty() : this.compliance;
    }

    /**
     * Describes the deployment of an artifact on a runtime.
     * 
     */
    @InputImport(name="deployment")
      private final @Nullable Input<DeploymentArgs> deployment;

    public Input<DeploymentArgs> getDeployment() {
        return this.deployment == null ? Input.empty() : this.deployment;
    }

    /**
     * Describes how this resource derives from the basis in the associated note.
     * 
     */
    @InputImport(name="derivedImage")
      private final @Nullable Input<DerivedArgs> derivedImage;

    public Input<DerivedArgs> getDerivedImage() {
        return this.derivedImage == null ? Input.empty() : this.derivedImage;
    }

    /**
     * Describes the initial scan status for this resource.
     * 
     */
    @InputImport(name="discovered")
      private final @Nullable Input<DiscoveredArgs> discovered;

    public Input<DiscoveredArgs> getDiscovered() {
        return this.discovered == null ? Input.empty() : this.discovered;
    }

    /**
     * This represents a DSSE attestation occurrence
     * 
     */
    @InputImport(name="dsseAttestation")
      private final @Nullable Input<DSSEAttestationOccurrenceArgs> dsseAttestation;

    public Input<DSSEAttestationOccurrenceArgs> getDsseAttestation() {
        return this.dsseAttestation == null ? Input.empty() : this.dsseAttestation;
    }

    /**
     * https://github.com/secure-systems-lab/dsse
     * 
     */
    @InputImport(name="envelope")
      private final @Nullable Input<EnvelopeArgs> envelope;

    public Input<EnvelopeArgs> getEnvelope() {
        return this.envelope == null ? Input.empty() : this.envelope;
    }

    /**
     * Describes the installation of a package on the linked resource.
     * 
     */
    @InputImport(name="installation")
      private final @Nullable Input<InstallationArgs> installation;

    public Input<InstallationArgs> getInstallation() {
        return this.installation == null ? Input.empty() : this.installation;
    }

    /**
     * An analysis note associated with this image, in the form "providers/{provider_id}/notes/{NOTE_ID}" This field can be used as a filter in list requests.
     * 
     */
    @InputImport(name="noteName")
      private final @Nullable Input<String> noteName;

    public Input<String> getNoteName() {
        return this.noteName == null ? Input.empty() : this.noteName;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * A description of actions that can be taken to remedy the `Note`
     * 
     */
    @InputImport(name="remediation")
      private final @Nullable Input<String> remediation;

    public Input<String> getRemediation() {
        return this.remediation == null ? Input.empty() : this.remediation;
    }

    /**
     *  The resource for which the `Occurrence` applies.
     * 
     */
    @InputImport(name="resource")
      private final @Nullable Input<ResourceArgs> resource;

    public Input<ResourceArgs> getResource() {
        return this.resource == null ? Input.empty() : this.resource;
    }

    /**
     * The unique URL of the image or the container for which the `Occurrence` applies. For example, https://gcr.io/project/image@sha256:foo This field can be used as a filter in list requests.
     * 
     */
    @InputImport(name="resourceUrl")
      private final @Nullable Input<String> resourceUrl;

    public Input<String> getResourceUrl() {
        return this.resourceUrl == null ? Input.empty() : this.resourceUrl;
    }

    /**
     * Describes a specific software bill of materials document.
     * 
     */
    @InputImport(name="sbom")
      private final @Nullable Input<DocumentOccurrenceArgs> sbom;

    public Input<DocumentOccurrenceArgs> getSbom() {
        return this.sbom == null ? Input.empty() : this.sbom;
    }

    /**
     * Describes a specific SPDX File.
     * 
     */
    @InputImport(name="spdxFile")
      private final @Nullable Input<FileOccurrenceArgs> spdxFile;

    public Input<FileOccurrenceArgs> getSpdxFile() {
        return this.spdxFile == null ? Input.empty() : this.spdxFile;
    }

    /**
     * Describes a specific SPDX Package.
     * 
     */
    @InputImport(name="spdxPackage")
      private final @Nullable Input<PackageInfoOccurrenceArgs> spdxPackage;

    public Input<PackageInfoOccurrenceArgs> getSpdxPackage() {
        return this.spdxPackage == null ? Input.empty() : this.spdxPackage;
    }

    /**
     * Describes a specific relationship between SPDX elements.
     * 
     */
    @InputImport(name="spdxRelationship")
      private final @Nullable Input<RelationshipOccurrenceArgs> spdxRelationship;

    public Input<RelationshipOccurrenceArgs> getSpdxRelationship() {
        return this.spdxRelationship == null ? Input.empty() : this.spdxRelationship;
    }

    /**
     * Describes an upgrade.
     * 
     */
    @InputImport(name="upgrade")
      private final @Nullable Input<UpgradeOccurrenceArgs> upgrade;

    public Input<UpgradeOccurrenceArgs> getUpgrade() {
        return this.upgrade == null ? Input.empty() : this.upgrade;
    }

    /**
     * Details of a security vulnerability note.
     * 
     */
    @InputImport(name="vulnerabilityDetails")
      private final @Nullable Input<VulnerabilityDetailsArgs> vulnerabilityDetails;

    public Input<VulnerabilityDetailsArgs> getVulnerabilityDetails() {
        return this.vulnerabilityDetails == null ? Input.empty() : this.vulnerabilityDetails;
    }

    public OccurrenceArgs(
        @Nullable Input<AttestationArgs> attestation,
        @Nullable Input<BuildDetailsArgs> buildDetails,
        @Nullable Input<ComplianceOccurrenceArgs> compliance,
        @Nullable Input<DeploymentArgs> deployment,
        @Nullable Input<DerivedArgs> derivedImage,
        @Nullable Input<DiscoveredArgs> discovered,
        @Nullable Input<DSSEAttestationOccurrenceArgs> dsseAttestation,
        @Nullable Input<EnvelopeArgs> envelope,
        @Nullable Input<InstallationArgs> installation,
        @Nullable Input<String> noteName,
        @Nullable Input<String> project,
        @Nullable Input<String> remediation,
        @Nullable Input<ResourceArgs> resource,
        @Nullable Input<String> resourceUrl,
        @Nullable Input<DocumentOccurrenceArgs> sbom,
        @Nullable Input<FileOccurrenceArgs> spdxFile,
        @Nullable Input<PackageInfoOccurrenceArgs> spdxPackage,
        @Nullable Input<RelationshipOccurrenceArgs> spdxRelationship,
        @Nullable Input<UpgradeOccurrenceArgs> upgrade,
        @Nullable Input<VulnerabilityDetailsArgs> vulnerabilityDetails) {
        this.attestation = attestation;
        this.buildDetails = buildDetails;
        this.compliance = compliance;
        this.deployment = deployment;
        this.derivedImage = derivedImage;
        this.discovered = discovered;
        this.dsseAttestation = dsseAttestation;
        this.envelope = envelope;
        this.installation = installation;
        this.noteName = noteName;
        this.project = project;
        this.remediation = remediation;
        this.resource = resource;
        this.resourceUrl = resourceUrl;
        this.sbom = sbom;
        this.spdxFile = spdxFile;
        this.spdxPackage = spdxPackage;
        this.spdxRelationship = spdxRelationship;
        this.upgrade = upgrade;
        this.vulnerabilityDetails = vulnerabilityDetails;
    }

    private OccurrenceArgs() {
        this.attestation = Input.empty();
        this.buildDetails = Input.empty();
        this.compliance = Input.empty();
        this.deployment = Input.empty();
        this.derivedImage = Input.empty();
        this.discovered = Input.empty();
        this.dsseAttestation = Input.empty();
        this.envelope = Input.empty();
        this.installation = Input.empty();
        this.noteName = Input.empty();
        this.project = Input.empty();
        this.remediation = Input.empty();
        this.resource = Input.empty();
        this.resourceUrl = Input.empty();
        this.sbom = Input.empty();
        this.spdxFile = Input.empty();
        this.spdxPackage = Input.empty();
        this.spdxRelationship = Input.empty();
        this.upgrade = Input.empty();
        this.vulnerabilityDetails = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AttestationArgs> attestation;
        private @Nullable Input<BuildDetailsArgs> buildDetails;
        private @Nullable Input<ComplianceOccurrenceArgs> compliance;
        private @Nullable Input<DeploymentArgs> deployment;
        private @Nullable Input<DerivedArgs> derivedImage;
        private @Nullable Input<DiscoveredArgs> discovered;
        private @Nullable Input<DSSEAttestationOccurrenceArgs> dsseAttestation;
        private @Nullable Input<EnvelopeArgs> envelope;
        private @Nullable Input<InstallationArgs> installation;
        private @Nullable Input<String> noteName;
        private @Nullable Input<String> project;
        private @Nullable Input<String> remediation;
        private @Nullable Input<ResourceArgs> resource;
        private @Nullable Input<String> resourceUrl;
        private @Nullable Input<DocumentOccurrenceArgs> sbom;
        private @Nullable Input<FileOccurrenceArgs> spdxFile;
        private @Nullable Input<PackageInfoOccurrenceArgs> spdxPackage;
        private @Nullable Input<RelationshipOccurrenceArgs> spdxRelationship;
        private @Nullable Input<UpgradeOccurrenceArgs> upgrade;
        private @Nullable Input<VulnerabilityDetailsArgs> vulnerabilityDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(OccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestation = defaults.attestation;
    	      this.buildDetails = defaults.buildDetails;
    	      this.compliance = defaults.compliance;
    	      this.deployment = defaults.deployment;
    	      this.derivedImage = defaults.derivedImage;
    	      this.discovered = defaults.discovered;
    	      this.dsseAttestation = defaults.dsseAttestation;
    	      this.envelope = defaults.envelope;
    	      this.installation = defaults.installation;
    	      this.noteName = defaults.noteName;
    	      this.project = defaults.project;
    	      this.remediation = defaults.remediation;
    	      this.resource = defaults.resource;
    	      this.resourceUrl = defaults.resourceUrl;
    	      this.sbom = defaults.sbom;
    	      this.spdxFile = defaults.spdxFile;
    	      this.spdxPackage = defaults.spdxPackage;
    	      this.spdxRelationship = defaults.spdxRelationship;
    	      this.upgrade = defaults.upgrade;
    	      this.vulnerabilityDetails = defaults.vulnerabilityDetails;
        }

        public Builder setAttestation(@Nullable Input<AttestationArgs> attestation) {
            this.attestation = attestation;
            return this;
        }

        public Builder setAttestation(@Nullable AttestationArgs attestation) {
            this.attestation = Input.ofNullable(attestation);
            return this;
        }

        public Builder setBuildDetails(@Nullable Input<BuildDetailsArgs> buildDetails) {
            this.buildDetails = buildDetails;
            return this;
        }

        public Builder setBuildDetails(@Nullable BuildDetailsArgs buildDetails) {
            this.buildDetails = Input.ofNullable(buildDetails);
            return this;
        }

        public Builder setCompliance(@Nullable Input<ComplianceOccurrenceArgs> compliance) {
            this.compliance = compliance;
            return this;
        }

        public Builder setCompliance(@Nullable ComplianceOccurrenceArgs compliance) {
            this.compliance = Input.ofNullable(compliance);
            return this;
        }

        public Builder setDeployment(@Nullable Input<DeploymentArgs> deployment) {
            this.deployment = deployment;
            return this;
        }

        public Builder setDeployment(@Nullable DeploymentArgs deployment) {
            this.deployment = Input.ofNullable(deployment);
            return this;
        }

        public Builder setDerivedImage(@Nullable Input<DerivedArgs> derivedImage) {
            this.derivedImage = derivedImage;
            return this;
        }

        public Builder setDerivedImage(@Nullable DerivedArgs derivedImage) {
            this.derivedImage = Input.ofNullable(derivedImage);
            return this;
        }

        public Builder setDiscovered(@Nullable Input<DiscoveredArgs> discovered) {
            this.discovered = discovered;
            return this;
        }

        public Builder setDiscovered(@Nullable DiscoveredArgs discovered) {
            this.discovered = Input.ofNullable(discovered);
            return this;
        }

        public Builder setDsseAttestation(@Nullable Input<DSSEAttestationOccurrenceArgs> dsseAttestation) {
            this.dsseAttestation = dsseAttestation;
            return this;
        }

        public Builder setDsseAttestation(@Nullable DSSEAttestationOccurrenceArgs dsseAttestation) {
            this.dsseAttestation = Input.ofNullable(dsseAttestation);
            return this;
        }

        public Builder setEnvelope(@Nullable Input<EnvelopeArgs> envelope) {
            this.envelope = envelope;
            return this;
        }

        public Builder setEnvelope(@Nullable EnvelopeArgs envelope) {
            this.envelope = Input.ofNullable(envelope);
            return this;
        }

        public Builder setInstallation(@Nullable Input<InstallationArgs> installation) {
            this.installation = installation;
            return this;
        }

        public Builder setInstallation(@Nullable InstallationArgs installation) {
            this.installation = Input.ofNullable(installation);
            return this;
        }

        public Builder setNoteName(@Nullable Input<String> noteName) {
            this.noteName = noteName;
            return this;
        }

        public Builder setNoteName(@Nullable String noteName) {
            this.noteName = Input.ofNullable(noteName);
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

        public Builder setRemediation(@Nullable Input<String> remediation) {
            this.remediation = remediation;
            return this;
        }

        public Builder setRemediation(@Nullable String remediation) {
            this.remediation = Input.ofNullable(remediation);
            return this;
        }

        public Builder setResource(@Nullable Input<ResourceArgs> resource) {
            this.resource = resource;
            return this;
        }

        public Builder setResource(@Nullable ResourceArgs resource) {
            this.resource = Input.ofNullable(resource);
            return this;
        }

        public Builder setResourceUrl(@Nullable Input<String> resourceUrl) {
            this.resourceUrl = resourceUrl;
            return this;
        }

        public Builder setResourceUrl(@Nullable String resourceUrl) {
            this.resourceUrl = Input.ofNullable(resourceUrl);
            return this;
        }

        public Builder setSbom(@Nullable Input<DocumentOccurrenceArgs> sbom) {
            this.sbom = sbom;
            return this;
        }

        public Builder setSbom(@Nullable DocumentOccurrenceArgs sbom) {
            this.sbom = Input.ofNullable(sbom);
            return this;
        }

        public Builder setSpdxFile(@Nullable Input<FileOccurrenceArgs> spdxFile) {
            this.spdxFile = spdxFile;
            return this;
        }

        public Builder setSpdxFile(@Nullable FileOccurrenceArgs spdxFile) {
            this.spdxFile = Input.ofNullable(spdxFile);
            return this;
        }

        public Builder setSpdxPackage(@Nullable Input<PackageInfoOccurrenceArgs> spdxPackage) {
            this.spdxPackage = spdxPackage;
            return this;
        }

        public Builder setSpdxPackage(@Nullable PackageInfoOccurrenceArgs spdxPackage) {
            this.spdxPackage = Input.ofNullable(spdxPackage);
            return this;
        }

        public Builder setSpdxRelationship(@Nullable Input<RelationshipOccurrenceArgs> spdxRelationship) {
            this.spdxRelationship = spdxRelationship;
            return this;
        }

        public Builder setSpdxRelationship(@Nullable RelationshipOccurrenceArgs spdxRelationship) {
            this.spdxRelationship = Input.ofNullable(spdxRelationship);
            return this;
        }

        public Builder setUpgrade(@Nullable Input<UpgradeOccurrenceArgs> upgrade) {
            this.upgrade = upgrade;
            return this;
        }

        public Builder setUpgrade(@Nullable UpgradeOccurrenceArgs upgrade) {
            this.upgrade = Input.ofNullable(upgrade);
            return this;
        }

        public Builder setVulnerabilityDetails(@Nullable Input<VulnerabilityDetailsArgs> vulnerabilityDetails) {
            this.vulnerabilityDetails = vulnerabilityDetails;
            return this;
        }

        public Builder setVulnerabilityDetails(@Nullable VulnerabilityDetailsArgs vulnerabilityDetails) {
            this.vulnerabilityDetails = Input.ofNullable(vulnerabilityDetails);
            return this;
        }
        public OccurrenceArgs build() {
            return new OccurrenceArgs(attestation, buildDetails, compliance, deployment, derivedImage, discovered, dsseAttestation, envelope, installation, noteName, project, remediation, resource, resourceUrl, sbom, spdxFile, spdxPackage, spdxRelationship, upgrade, vulnerabilityDetails);
        }
    }
}